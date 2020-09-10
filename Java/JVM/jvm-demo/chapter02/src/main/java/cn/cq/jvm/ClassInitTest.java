package cn.cq.jvm;

/**
 * ClassInitTest <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 15:07 <br>
 */
public class ClassInitTest {
    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
        //System.out.println(number);//报错：非法的前向引用
    }

    //linking阶段的prepare: number =0 ---->initial:20-->10
    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(num);//2
        System.out.println(number);//10
    }
}
