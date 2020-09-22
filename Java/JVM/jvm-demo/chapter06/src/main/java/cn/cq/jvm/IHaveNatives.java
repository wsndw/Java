package cn.cq.jvm;

/**
 * IHaveNatives <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-22 11:22 <br>
 */
public class IHaveNatives {
    public native void Native1(int x);

    native static public long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;
}
