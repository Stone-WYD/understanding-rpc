package samples.serialization.fastjson;


import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;

/**
 * @Description:
 * @author: huazhongming
 * @Date: Created in 2021/1/17 7:14 下午
 */
public class SerializationTest {

    public static void main(String[] args) {
        Person person = new Person("crazyhzm", 20, new BigDecimal("1234567.890123"));
        Person person2 = new Person("111", 11, new BigDecimal("11111.11111"));
        // FastJson 每次给一个线程只分配一个 char buf[] 来存放序列化后的字符串
        String jsonString = JSON.toJSONString(person);
        String jsonString2 = JSON.toJSONString(person2);
        String jsonString3 = JSON.toJSONString(person2);
        System.out.println(jsonString);

        // FastJson 序列化时 key-value 是有序的，所以反序列化时只需要匹配 key 的然后设置属性值即可，不需要将 key 取出再匹配
        Person user = JSON.parseObject(jsonString, Person.class);


    }

}
