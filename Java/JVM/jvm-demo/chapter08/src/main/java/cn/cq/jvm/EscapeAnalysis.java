package cn.cq.jvm;

/**
 * 逃逸分析
 * 如何快速的判断是否发生了逃逸分析，
 * 大家就看new的对象实例是否有可能在方法外被调用
 *
 * @author CQ
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;

    /*方法返回EscapAnalysis对象，发生逃逸*/
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*为成员属性赋值，发生逃逸*/
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }
    //思考：如果当前的obj引用声明为static的？仍然发生逃逸

    /*对象的作用域仅在当前方法中有效，没有发生逃逸*/
    public void useEscapAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /*引用成员变量的值，发生逃逸*/
    public void useEscapeAnalysis() {
        EscapeAnalysis e = getInstance();
    }
}
