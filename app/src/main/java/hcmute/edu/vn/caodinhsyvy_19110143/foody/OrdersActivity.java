package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OrdersActivity {
    private View view;
    private Context context;

    ListView lstViewOrders;

    public OrdersActivity(Context context) {
        this.context = context;
        view = View.inflate(this.context, R.layout.activity_orders, null);
        onCreate();
    }


    public View getView(){
        return this.view;
    }

    private void Mapping() {
        lstViewOrders = view.findViewById(R.id.lstViewOrders);
    }

    private void onCreate() {
        Mapping();

        List<String> orders = new ArrayList<>();
        orders.add("abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc abc ");
        orders.add("abc");
        orders.add("abc");
        orders.add("abc");
        orders.add("abc");
        orders.add("abc");
        orders.add("abc");
        orders.add("abc");

        LstViewOrdersAdapter adapter = new LstViewOrdersAdapter(context, orders);
        lstViewOrders.setAdapter(adapter);
    }




}
