package proxy.cglibproxy;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class CglibMain {


    public static void main(String[] args) {
        Apple apple = new Apple();

        CglibProxy cglibProxy = new CglibProxy(apple);

        //生成代理对象
        Apple res = (Apple) cglibProxy.getProxyInstance();
        res.eat();
    }
}
