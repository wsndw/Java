package cn.cq.jvm;

/**
 * HeapDemo <br>
 *     -Xms10m -Xmx10m
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-25 15:42 <br>
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
