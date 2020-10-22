package cn.cq.jvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * MethodInnerStrucTest <br>
 * 方法区结构
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-10-09 13:46 <br>
 */
public class MethodInnerStrucTest extends Object implements Comparable<String>, Serializable {
    //属性
    public int num = 10;
    private static String str = "测试方法的内部结构";

    //构造器
    //方法
    public void test1() {
        int count = 20;
        System.out.println("count = " + count);
    }

    public static int test2(int cal) {
        int result = 0;
        try {
            int value = 30;
            result = value / cal;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void test3() {
        List<Test> testList = new ArrayList<>();
        Test test = new Test();
        test.setA(0);
        test.setB(0);
        testList.add(test);


    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        MethodInnerStrucTest methodInnerStrucTest = new MethodInnerStrucTest();
        for (int i = 0; i < 1000000000; i++) {
            methodInnerStrucTest.test3();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}

class Test {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
