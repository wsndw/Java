package cn.cq.jvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * HeapInstanceTest <br>
 * -Xms600m -Xmx600m
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-28 18:42 <br>
 */
public class HeapInstanceTest {
    byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        ArrayList<HeapInstanceTest> list = new ArrayList<HeapInstanceTest>();
        while (true) {
            list.add(new HeapInstanceTest());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
