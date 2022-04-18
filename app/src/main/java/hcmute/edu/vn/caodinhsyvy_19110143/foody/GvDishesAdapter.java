package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GvDishesAdapter extends BaseAdapter {
    private Context context;
    private List<String> dishes;

    public GvDishesAdapter(Context context, List<String> dishes) {
        this.context = context;
        this.dishes = dishes;
    }


    @Override
    public int getCount() {
        return dishes.size();
    }

    @Override
    public Object getItem(int i) {
        return dishes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = View.inflate(this.context, R.layout.card_dish, null);

        ImageView img = view.findViewById(R.id.img);
        TextView txtName = view.findViewById(R.id.txtName);

        txtName.setText(dishes.get(i));
        if (dishes.get(i).trim().equals(""))
            img.setImageResource(0);

        return view;
    }
}
