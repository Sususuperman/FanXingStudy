package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/22 14:46.
 * 文件 FanXingPractice
 * 描述 /**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：cclass FXTest<T1, T2> implements FXParentInterface<T1, T2>
 * 如果不声明泛型，如：class FXTest implements FXParentInterface<T1,T2>，编译器会报错：
 */

public class FXTest<T1, T2> implements FXParentInterface<T1, T2> {
    @Override
    public void setData1(T1 t1) {

    }

    @Override
    public void setData2(T2 t2) {

    }

    @Override
    public T1 getData1() {
        return null;
    }

    @Override
    public T2 getData2() {
        return null;
    }
}
