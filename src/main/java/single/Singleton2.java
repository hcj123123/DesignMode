package single;

/**
 * @author Jackey
 * @date 2020/5/30
 */

public class Singleton2 {
    /**
     * @Description 在类内部定义
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:26
     */
    private static Singleton2 instance;

    static {

        instance = new Singleton2();
    }


    /**
     * @Description 私有的构造函数, 外部无法访问
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:26
     */
    private Singleton2() {
    }


    /**
     * @Description
     * @Param
     * @Return
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 18:26
     */
    public static Singleton2 getInstance() {
        return instance;
    }
}
