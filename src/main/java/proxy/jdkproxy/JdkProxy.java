package proxy.jdkproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class JdkProxy {

    private Fruit targetObj;

    public JdkProxy(Fruit object) {
        targetObj = object;
    }


    /**
     * @Description 使用jdk动态代理，为目标对象生成代理对象
     * @Param []
     * @Return java.lang.Object
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 23:08
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
                targetObj.getClass().getInterfaces(), (Object object, Method method,
                                                       Object[] args) -> {
                    System.out.println("吃苹果前");
                    Object res = method.invoke(targetObj, args);
                    System.out.println("吃苹果后");
                    return res;
                }
        );
    }

}
