package samples.wyd.proxy.cglib;

/**
 * @program: mybatis-test-from-github
 * @description: cglib 测试目标类
 * @author: Stone
 * @create: 2023-10-30 17:22
 **/
public class ProxyTestTargetClass {

    public void wydTest1(){
        System.out.println("wydTest1 被调用了...");
    }

    public String yxyTest2(){
        System.out.println("yxyTest2 被调用了...");
        return "yxyTest2 被调用了...";
    }


    public Integer proxyTest3(String proxy) {
        System.out.println("proxyTest3 被调用了...传参为：" + proxy);
        return 1;
    }

}
