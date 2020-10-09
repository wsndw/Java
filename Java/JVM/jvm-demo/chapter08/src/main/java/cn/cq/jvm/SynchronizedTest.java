package cn.cq.jvm;

/**
 * 同步省略说明
 *
 * @author 46085
 */
public class SynchronizedTest {
    public void f(){
        Object hollis = new Object();
        synchronized (hollis){
            System.out.println(hollis);
        }
    }
}
