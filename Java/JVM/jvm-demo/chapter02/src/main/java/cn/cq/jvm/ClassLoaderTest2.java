package cn.cq.jvm;



/**
 * ClassLoaderTest2 <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 10:46 <br>
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        ClassLoader classLoader = null;
        try {
            //1.
            classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            //2.
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            //3.
            ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(classLoader2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
