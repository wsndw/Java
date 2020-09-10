package cn.cq.jvm;

/**
 * ClinitTest <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 15:12 <br>
 */
public class ClinitTest {
    //任何一个类声明以后，内部至少存在一个类的构造器
    private int a = 1;
    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest() {
        a = 10;
        int d = 20;
    }
}
