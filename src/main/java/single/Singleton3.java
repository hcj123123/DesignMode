package single;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class Singleton3 {

    /**
     * @Description
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:36
     */
    private static Singleton3 instance;


    /**
     * @Description 私有构造方法
     * @Param []
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:36
     */
    private Singleton3() {
    }


    /**
     * @Description 对外提供获取实例的静态方法
     * @Param []
     * @Return single.Singleton3
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:36
     */
    public static Singleton3 getInstance() {
        //在对象被使用的时候才实例化
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
