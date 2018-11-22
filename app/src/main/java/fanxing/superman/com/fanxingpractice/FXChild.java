package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/22 9:55.
 * 文件 FanXingPractice
 * 描述   继承泛型类别 子类
 */

public class FXChild<T1, T2, T3> extends FXParent<T1, T2> implements FXParentInterface<T1, T2> {
    private T3 t3;

    public T3 getT3() {
        return t3;
    }

    public void setT3(T3 t3) {
        this.t3 = t3;
    }

    @Override
    public void setData1(T1 t1) {

    }

    @Override
    public void setData2(T2 t2) {

    }

    @Override
    public T1 getData1() {
        return getT1();
    }

    @Override
    public T2 getData2() {
        return getT2();
    }
}
