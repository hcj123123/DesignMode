package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class CglibProxy implements MethodInterceptor {


    private Apple targetObj;

    public CglibProxy(Apple object) {
        targetObj = object;
    }


    /**
     * @Description 获取目标对象的代理对象
     * @Param []
     * @Return java.lang.Object
     * @Author Jackey
     * @Date 2020/5/30
     * @Time 23:05
     */
    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类对象
        enhancer.setSuperclass(this.targetObj.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类，也就是代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("吃苹果前");
        Object res = method.invoke(targetObj, args);
        System.out.println("吃苹果后");
        return res;

    }
}
