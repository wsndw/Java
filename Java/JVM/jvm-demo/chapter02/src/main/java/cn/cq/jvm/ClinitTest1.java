package cn.cq.jvm;

/**
 * ClinitTest1 <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 15:26 <br>
 */
public class ClinitTest1 {
    static class Father {
        public static int A = 1;

        static {
            A = 2;
        }
    }

    static class Son extends Father {
        private static int B = A;
    }

    public static void main(String[] args) {
        //加载Father类，其次加载Son类
        System.out.println(Son.B);//2
    }
}
