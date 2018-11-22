package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/22 10:22.
 * 文件 FanXingPractice
 * 描述 泛型方法
 */

public class FXMethod {
    /*
    *<T>必不可少,表示这是一个泛型方法，并且声明了一个泛型T
    * 这个T可以出现在这个泛型方法的任意位置.
     * 泛型的数量也可以为任意多个
       */
    public static <T> T dowork(T t) {
        return t;
    }
}
