package cn.cq.jvm;

/**
 * EdenSurvivorTest <br>
 *     -Xms600m -Xmx600m
 *     -NewRatio:设置新生代与老年代的比例。默认值是2。
 *               当前即为，新生代200m+老年代200*2=400m=600m
 *     -XX:SurvivorRatio：设置新生代中中Eden区和Survivor区的比例
 *     -XX:-UseAdaptiveSizePolicy：关闭自适应的内存分配策略
 *     -Xmn：设置新生代空间大小
 *
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-27 14:37 <br>
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("-----------");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
