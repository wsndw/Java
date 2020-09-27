package cn.cq.jvm;

import java.util.ArrayList;
import java.util.Random;

/**
 * OOMTest <br>
 *     -Xms600m -Xmx600m
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-27 14:19 <br>
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<Picture>();
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture {
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
