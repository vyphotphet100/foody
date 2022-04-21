package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private View view;
    private Context context;

    GridView gvDishes;
    TextView txtLocation;

    public HomeActivity(Context context) {
        this.context = context;
        view = View.inflate(this.context, R.layout.activity_home, null);
        onCreate();
    }

    public View getView(){
        return this.view;
    }

    private void onCreate() {
        Mapping();
        SetListenerEvent();

        GetDataForGvDishes();

    }

    private void Mapping() {
        gvDishes = view.findViewById(R.id.gvDishes);
        txtLocation = view.findViewById(R.id.txtLocation);
    }

    private void SetListenerEvent() {
        // txtLocation -> onCLick
        txtLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "Location", Toast.LENGTH_SHORT).show();
                DialogLocation();
            }
        });
    }

    private void GetDataForGvDishes() {
        List<String> dishes = new ArrayList<>();
        dishes.add("Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue");
        dishes.add("Bun dau Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue Bun bo Hue");
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

    private void GetDataForTxtLocation(Dialog locationDialog) {
        ListView lstViewLocation = locationDialog.findViewById(R.id.lstViewLocation);
        List<String> locations = new ArrayList<>();
        locations.add("TP.HCM");
        locations.add("Quảng Bình");
        locations.add("Huế");
        locations.add("Bình Dương");
        locations.add("Đồng Nai");
        locations.add("Quảng Trị");
        locations.add("Quảng Ngãi");

        ArrayAdapter adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, locations);
        lstViewLocation.setAdapter(adapter);
    }

    private void DialogLocation() {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_location);
        GetDataForTxtLocation(dialog);

        dialog.show();

        ListView lstViewLocation = dialog.findViewById(R.id.lstViewLocation);
        lstViewLocation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtLocation.setText((String)lstViewLocation.getItemAtPosition(i));
                dialog.dismiss();
            }
        });


    }




}