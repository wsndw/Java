package cn.cq.jvm;

/**
 * HelloApp <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 14:42 <br>
 */
public class HelloApp {
    //prepare准备阶段: a=0 ----> initial初始化阶段: a=1
    private static int a = 1;
    public static void main(String[] args) {
        System.out.println(a);
    }
}
