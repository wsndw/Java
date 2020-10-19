package cn.cq.jvm;

/**
 * MethodAreaTest <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-10-19 15:30 <br>
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}
class Order{
    public static int count = 1;
    public static final int number = 2;

    public static void hello(){
        System.out.println("hello!");
    }
}
