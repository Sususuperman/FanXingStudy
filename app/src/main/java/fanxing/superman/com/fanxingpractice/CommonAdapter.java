package fanxing.superman.com.fanxingpractice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author Superman
 * @date 2018/10/9
 */

public abstract class CommonAdapter<T> extends BaseAdapter {

    protected LayoutInflater mInflater;
    protected Context mContext;
    protected List<T> mDatas;

    public CommonAdapter(Context context, List<T> mDatas) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(mContext);
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public abstract View getView(int i, View view, ViewGroup viewGroup);


    public <T> void printMsg(T... args) {
        for (T t : args){
            Log.d("泛型测试","t is " + t);
        }
    }

}
