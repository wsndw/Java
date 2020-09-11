package cn.cq.jvm;

/**
 * StackErrorTest <br>
 * 演示栈中异常:StackOverflowError
 * 默认情况下：cout：11412
 * 设置栈的大小：-Xss256k cout: 2468
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-11 15:37 <br>
 */
public class StackErrorTest {
    private static int cout = 1;
    public static void main(String[] args) {
        System.out.println(cout);
        cout++;
        main(args);
    }
}
