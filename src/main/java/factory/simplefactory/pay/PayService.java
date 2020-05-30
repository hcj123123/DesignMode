package factory.simplefactory.pay;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * @Target - 注解使用在类、接口上
 * @Retention - 注解作用于运行期
 *
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PayService {
    // 不同的key关键字可以对应同一个支付服务
    public String[] channel();
}
