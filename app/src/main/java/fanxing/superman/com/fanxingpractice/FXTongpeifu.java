package fanxing.superman.com.fanxingpractice;

/**
 * 作者 Superman
 * 日期 2018/11/21 16:39.
 * 文件 FanXingPractice
 * 描述 ?类型通配符，不是类型形参
 */

public class FXTongpeifu {

    public void getClass1(Test<?> test) {

    }

//    public void getClass2(Test<T> test) {//报错
//
//    }

    class Test<T> {
        private T t;

        public Test(T t) {
            this.t = t;
        }
    }
}
