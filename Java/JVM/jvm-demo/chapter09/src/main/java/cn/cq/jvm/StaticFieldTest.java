package cn.cq.jvm;

/**
 *
 * StaticFieldTest <br>
 *     结论：
 *     静态引用对应的对象实例始终都存在堆空间
 *     jdk7：
 *          -Xms200m -Xmx200m -XX:PermSize=300m -XX:+PrintGCDetails
 *     jdk8：
 *          -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:+PrintGCDetails
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-10-22 14:23 <br>
 */
public class StaticFieldTest {
    //100M
    private static byte[] arr = new byte[1024 * 1024 * 100];

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);
        /*try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
