package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/22 10:08.
 * 文件 FanXingPractice
 * 描述 子类实现泛型接口
 */

public class FXChildClass<T1, T2> implements FXParentInterface<T1, T2> {
    private T1 t1;
    private T2 t2;

    @Override
    public void setData1(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void setData2(T2 t2) {
        this.t2 = t2;
    }

    @Override
    public T1 getData1() {

        return t1;
    }

    @Override
    public T2 getData2() {

        return t2;
    }
}
