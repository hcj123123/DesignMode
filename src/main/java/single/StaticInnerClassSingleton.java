package single;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class StaticInnerClassSingleton {

    /**
     * @Description 在静态内部类中初始化实例对象
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:28
     */
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }


    private StaticInnerClassSingleton() {
    }


    /**
     * @Description 对外提供获取实例的静态方法
     * @Param []
     * @Return single.StaticInnerClassSingleton
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:35
     */
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
