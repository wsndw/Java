package cn.cq.jvm;


/**
 * StaticObjTest <br>
 *     《深入理解Java虚拟机》中的案例
 *     staticObj、instanceObj、localObj存放在哪里
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-10-22 14:38 <br>
 */
public class StaticObjTest {
    static class Test{
        //静态
        static ObjectHolder staticObj = new ObjectHolder();
        //非静态
        ObjectHolder instanceObj = new ObjectHolder();

        void foo(){
            //局部变量
            ObjectHolder localObj = new ObjectHolder();
            System.out.println("done");
        }
    }
    private static class ObjectHolder{
    }

    public static void main(String[] args) {
        Test test = new StaticObjTest.Test();
        test.foo();
    }
}
