package cn.cq.jvm;

import java.util.Date;

/**
 * LocalVariablesTest <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-15 20:11 <br>
 */
public class LocalVariablesTest {
    private int cout = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public LocalVariablesTest() {
        cout = 1;
    }

    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int cout = 10;
        System.out.println(cout);
        //因为this变量不存在于当前方法的局部变量表中！！
        //System.out.println(this.cout);
    }

    public void test1() {
        Date date = new Date();
        String name1 = "cq";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2) {
        dateP = null;
        name2 = "cq1";
        double weight = 140;
        char gender = '男';
        return dateP + name2;
    }

    public void test3() {
        cout++;
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        int c = a + 1;
    }

    public void test5temp(){
        int num;
        //错误信息：变量num未进行初始化
        //System.out.println(num);
    }
}
