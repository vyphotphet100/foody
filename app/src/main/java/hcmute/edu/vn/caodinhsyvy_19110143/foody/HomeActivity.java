package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import android.content.ClipData;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity{

    private View view;
    private Context context;

    GridView gvDishes;

    private void onCreate() {
        mapping();

        List<String> dishes = new ArrayList<>();
        dishes.add("Bun bo Hue");
        dishes.add("Bun dau");
        dishes.add("Banh canh");
        dishes.add("Cha gio");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("Hu tieu");
        dishes.add("");
        dishes.add("");

        GvDishesAdapter gvDishesAdapter = new GvDishesAdapter(context, dishes);

        gvDishes.setAdapter(gvDishesAdapter);
    }

    public HomeActivity(Context context) {
//        Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show();
        this.context = context;
        view = View.inflate(this.context, R.layout.activity_home, null);
        onCreate();
    }

    private void mapping() {
        gvDishes = view.findViewById(R.id.gvDishes);
    }


    public View getView(){
        return this.view;
    }

}