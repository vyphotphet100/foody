package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity{

    private View mainView;
    private Context context;

    Button btn;

    private void onCreate() {
        mapping();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Hellooooo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public HomeActivity(Context context) {
//        Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show();
        this.context = context;
        mainView = View.inflate(this.context, R.layout.activity_home, null);
        onCreate();
    }

    private void mapping() {
        btn = mainView.findViewById(R.id.button);
    }


    public View getMainView(){
        return this.mainView;
    }
}