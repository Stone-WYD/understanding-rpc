package samples.wyd.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: mybatis-test-from-github
 * @description: 代理类生成测试类
 * @author: Stone
 * @create: 2023-10-30 16:46
 **/
public class GenerateProxyTest {

    public static void main(String[] args) {
        String path = "$Proxy0.class";
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{ProxyTestTargetInterface.class});

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
