package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GvOrdersAdapter extends BaseAdapter {
    private Context context;
    private List<String> orders;

    public GvOrdersAdapter(Context context, List<String> orders) {
        this.context = context;
        this.orders = orders;
    }

    @Override
    public int getCount() {
        return orders.size();
    }

    @Override
    public Object getItem(int i) {
        return orders.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = View.inflate(this.context, R.layout.line_order, null);

        ImageView img = view.findViewById(R.id.img);
        TextView txtName = view.findViewById(R.id.txt);

        txtName.setText(orders.get(i));
        return view;
    }
}
