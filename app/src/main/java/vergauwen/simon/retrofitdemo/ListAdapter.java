package vergauwen.simon.retrofitdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import vergauwen.simon.retrofitdemo.model.Datum;

/**
 * Created by Simon on 24/09/15.
 */
public class ListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Datum> mData = null;

    public ListAdapter(Context c){
        mContext = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_item, parent, false);
        } else {
            view = convertView;
        }

        TextView temp_view = (TextView)view.findViewById(R.id.temp_text_view);
        TextView date_view = (TextView)view.findViewById(R.id.time_and_date_text_view);
        TextView summary_view = (TextView)view.findViewById(R.id.summary_text_view);

        date_view.setText(mData.get(position).getTime().toString());
        summary_view.setText(mData.get(position).getSummary());
        temp_view.setText(mData.get(position).getTemperature().toString());
        return view;
    }

    @Override
    public int getCount() {
        if(mData != null){
            return mData.size();
        }
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    public void clear(){
        mData.clear();
    }

    public void add(List<Datum> data){
        mData = new ArrayList<Datum>(data);
    }

}
