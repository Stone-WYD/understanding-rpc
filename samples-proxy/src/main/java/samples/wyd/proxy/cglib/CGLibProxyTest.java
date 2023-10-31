package samples.wyd.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @program: mybatis-test-from-github
 * @description: cglib 测试类
 * @author: Stone
 * @create: 2023-10-30 17:33
 **/
public class CGLibProxyTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ProxyTestTargetClass.class);
        enhancer.setCallback(new DemoMethodInterceptor<>(new ProxyTestTargetClass()));
        ProxyTestTargetClass proxy = (ProxyTestTargetClass) enhancer.create();
        proxy.yxyTest2();
    }
}
