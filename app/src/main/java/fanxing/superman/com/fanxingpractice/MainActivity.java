package fanxing.superman.com.fanxingpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.integer);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FXTongpeifu<Integer> test1 = new FXTongpeifu<Integer>(123);
                showKey(test1);
            }
        });

        FXParent<Integer, String> fxParent = new FXParent<>();
    }


    public void showKey(FXTongpeifu<?> test) {
        Log.e("泛型通配符测试：", "" + test.getKey());
    }

    /**
     * 传入的类型必须为指定类型的子类
     *
     * @param test
     */
    public void showKey2(FXTongpeifu<? extends Number> test) {
        Log.e("泛型通配符测试：", "" + test.getKey());
    }

    public interface Listener<E> {
        void add(E e);

        Iterator<E> iterator();
    }

}
