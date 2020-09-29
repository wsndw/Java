package cn.cq.jvm;

/**
 * YoungOldAreaTest <br>
 *     测试：大对象直接进入老年代
 *          -Xms60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-29 15:59 <br>
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        //20m
        byte[] buffer = new byte[1024*1024*20];
    }
}
