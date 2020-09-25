package cn.cq.jvm;

/**
 * SimpleHeap <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-25 16:32 <br>
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        int[] arr = new int[10];
        Object[] arr1 = new Object[10];
    }
}
