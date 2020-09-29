package cn.cq.jvm;

/**
 * TLABArgsTest <br>
 *     测试-XX:UseTLAB参数是否开启的情况
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-29 17:00 <br>
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("-------------");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
