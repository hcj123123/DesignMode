package factory.simplefactory.pay;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

public class PackageUtil {


    /**
     * 根据传入的包名及类对象来扫描出来该包下所有的包含子包的满足目标泛型T的类对象并返回
     *
     * @return
     */

    public static <T> Set<Class<T>> getPackageClasses(String s, Class<T> payClass) {

        Set<Class<T>> set = new HashSet<Class<T>>();
        // 是否循环搜索子包
        boolean recursive = true;
        // 包名字
        String packageName = s;
        // 包名对应的路径名称
        String packageDirName = packageName.replace('.', '/');
        // 保存目标package下的所有目录
        Enumeration<URL> dirs;
        // 获取目标包下所有目录
        try {

            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                // 得到一个URL的协议
                String protocol = url.getProtocol();
                if ("file".equals(protocol)) {
                    // 对字符串进行URL解码
                    String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                    // 找到该目录下所有的class<T>
                    findClassInPackageByFile(packageName, filePath, recursive, set, payClass);
                } else if ("jar".equals(protocol)) {
                    // jar包不出处理，一般使用时也是扫描自己写的代码，也不会扫描到jar包
                    System.out.println("jar类型的扫描");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }

    public static <T> void findClassInPackageByFile(String packageName, String filePath, final boolean recursive, Set<Class<T>> clazzs, Class<T> clazz) {

        File dir = new File(filePath);
        if (!dir.exists() || !dir.isDirectory()) {
            // 目录不存在或者该目录不是一个文件夹都不行
            return;
        }
        // 在给定的目录下找到所有的文件，并且进行条件过滤
        File[] dirFiles = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                boolean acceptDir = recursive && file.isDirectory();// 接受dir目录，既接受文件夹中还有一个文件夹
                boolean acceptClass = file.getName().endsWith("class");// 接受class文件
                return acceptDir || acceptClass;
            }
        });
        for (File file : dirFiles) {
            if (file.isDirectory()) {
                // 如果是文件夹则继续调用该方法：递归思想
                findClassInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, clazzs, clazz);
            } else {
                // 去掉class文件的.class后缀
                String className = file.getName().substring(0, file.getName().length() - 6);
                try {
                    // 使用类加载器得到对象
                    Class<?> clazzz = Thread.currentThread().getContextClassLoader().loadClass(packageName + "." + className);
                    if (clazz.isAssignableFrom(clazzz)) {
                        // 当clazz是clazzz的父类或者两者相同的时候返回true,既根据泛型T过滤掉了不需要的类对象,我们需要的只是T或者T的子类
                        clazzs.add((Class<T>) clazzz);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
