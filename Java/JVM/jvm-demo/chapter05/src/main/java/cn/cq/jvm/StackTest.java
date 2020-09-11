package cn.cq.jvm;

/**
 * StackTest <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-11 15:05 <br>
 */
public class StackTest {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.methodA();
    }
    public void methodA() {
        int i = 10;
        int j = 20;
        methodB();
    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }
}
