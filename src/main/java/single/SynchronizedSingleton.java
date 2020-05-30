package single;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class SynchronizedSingleton {


    /**
     * @Description 定义实例
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:37
     */
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    /**
     * @Description 对外提供获取实例的静态方法, 对该方法加锁
     * @Param []
     * @Return single.SynchronizedSingleton
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:38
     */
    public static synchronized SynchronizedSingleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

}
