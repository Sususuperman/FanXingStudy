package fanxing.superman.com.fanxingpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List list = new LinkedList();
        list.add(new Integer(0));
        Integer i = (Integer) list.iterator().next();
    }

    public interface Listener<E> {
        void add(E e);

        Iterator<E> iterator();
    }

}
