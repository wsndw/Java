package cn.cq.jvm;

/**
 * Lambda <br>
 *     体会invokedynamic指令
 *
 * @author CQ <br>
 * @version 1.0 <br>
 * @date 2020-09-21 16:10 <br>
 */
@FunctionalInterface
interface Func{
    public boolean func(String str);
}
public class Lambda {
    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s ->{
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s->{
            return true;
        });
    }
}
