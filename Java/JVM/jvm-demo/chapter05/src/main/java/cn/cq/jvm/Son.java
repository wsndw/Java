package cn.cq.jvm;

/**
 * Son <br>
 *     解析调用中非虚方法、虚方法的测试
 *     invokestatic指令和invokespecial指令调用的方法称为非虚方法
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-21 15:19 <br>
 */
public class Son extends Father {
    public Son() {
        //invokespecial非虚方法：<init>方法，显式调用父类
        super();
    }

    public Son(int age) {
        //invokespecial非虚方法：<init>方法，显式调用自己
        this();
    }

    //不是重写的父类的静态方法，因为静态方法不能被重写
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private " + str);
    }

    public void show() {
        //invokestatic非虚方法：静态方法，父类虽然有同名方法，
        // 但是因为是static静态方法，所以不能重写，此处即为固定调用子类的showStatic方法
        showStatic("cn.cq");

        //invokestatic非虚方法：静态方法，显式调用父类的showStatic方法
        super.showStatic("good!");

        //invokespecial非虚方法：私有方法，调用自己的私有方法
        showPrivate("hello");

        //invokespecial非虚方法：父类方法，显式调用父类的方法
        super.showCommon();

        //invokevirtual虚方法：因为有可能是子类自己重写的showFinal方法，编译时无法确定
        //但是因为此方法声明有final，不能被子类重写，所以运行时会调用父类方法
        // 即，也被认为此方法是非虚方法
        showFinal();
        //invokespecial非虚方法：显式调用父类方法
        super.showFinal();

        //invokevirtual虚方法：子类有可能重写，编译时无法确定下来
        showCommon();
        //invokevirtual虚方法：自己定义的方法
        info();


        MethodInterface in = null;
        //invokeinterface虚方法，接口需要实现，所以是虚方法
        in.methodA();
    }

    public void info() {
    }

    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }

}

interface MethodInterface {
    void methodA();
}

class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}
