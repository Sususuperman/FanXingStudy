package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/22 10:03.
 * 文件 FanXingPractice
 * 描述 泛型接口
 */

public interface FXParentInterface<T1, T2> {
    void setData1(T1 t1);

    void setData2(T2 t2);

    T1 getData1();

    T2 getData2();


}
