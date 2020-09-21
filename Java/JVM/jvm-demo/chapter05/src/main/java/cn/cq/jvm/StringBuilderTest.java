package cn.cq.jvm;

/**
 * StringBuilderTest <br>
 * 面试题：
 * 方法中定义的局部变量是否线程安全？具体情况具体分析
 *  何为线程安全？
 *      如果只有一个线程才可以操作此数据，则必是线程安全的
 *      如果有多个线程操作此数据，则此数据是共享数据。
 *          如果不考虑同步机制的话，会存在线程安全问题
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-21 19:30 <br>
 */

public class StringBuilderTest {

    //s1的声明方式是线程安全的
    public static void method1() {
        //StringBuilder:线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        //...
    }

    //sBuilder的操作过程：是线程不安全的
    public static void method2(StringBuilder sBuilder) {
        sBuilder.append("a");
        sBuilder.append("b");
        //...
    }

    //s1的操作：线程不安全（把s1返回出去了）
    public static StringBuilder method3() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作：线程安全,tostring会重新创建新的对象（内部消亡）
    public static String method4() {
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        new Thread(() -> {
            s.append("a");
            s.append("b");
        }).start();
        method2(s);
    }
}
