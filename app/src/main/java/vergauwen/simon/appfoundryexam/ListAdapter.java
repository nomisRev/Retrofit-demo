package vergauwen.simon.appfoundryexam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Simon on 24/09/15.
 */
public class ListAdapter extends BaseAdapter {
    private Context mContext;
    private String[][] data = null;

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

        date_view.setText(data[position][0]);
        summary_view.setText(data[position][1]);
        temp_view.setText(data[position][2]);

        return view;
    }

    @Override
    public int getCount() {
        if(data != null){
            return data.length;
        }
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    public void clear(){
        data = null;
    }

    public void add(String[][] result){
        data = new String[result.length][result[0].length];
        for(int i = 0; i < result.length;i++) {
            for(int j = 0; j < result[0].length;j++) {
                data[i][j]= result[i][j];
            }
        }
    }

}
