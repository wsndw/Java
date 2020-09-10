package java.lang;

/**
 * String <br>
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-10 11:45 <br>
 */
public class String {
    static {
        System.out.println("自定义String");
    }

//    错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
//    public static void main(String[] args)
//    否则 JavaFX 应用程序类必须扩展javafx.application.Application
    public static void main(String[] args) {
        System.out.println("hello,String");
    }
}
