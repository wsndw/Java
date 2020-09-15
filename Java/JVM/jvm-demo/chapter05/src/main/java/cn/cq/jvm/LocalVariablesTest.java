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
        LocalVariablesTest test =new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int cout = 10;
        System.out.println(cout);
    }

    private void test1() {
    }
}
