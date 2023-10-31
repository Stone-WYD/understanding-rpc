package samples.wyd.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: mybatis-test-from-github
 * @description: cglib 动态代理方法拦截handle类
 * @author: Stone
 * @create: 2023-10-30 17:28
 **/
public class DemoMethodInterceptor<T> implements MethodInterceptor {

    private T target;

    public DemoMethodInterceptor(T target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("进行 cglib 前置增强...");
        method.invoke(target, objects);
        // methodProxy.invoke(target, objects);
        System.out.println("进行 cglib 后置增强...");
        return null;
    }
}
