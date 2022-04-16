package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    View homeActivityView, ordersActivityView, accountActivityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout placeHolder = findViewById(R.id.mainLayout);
        homeActivityView = (new HomeActivity(MainActivity.this)).getMainView();
        ordersActivityView = View.inflate(this, R.layout.activity_orders, null);
        accountActivityView = View.inflate(this, R.layout.activity_account, null);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                placeHolder.removeView(homeActivityView);
                placeHolder.removeView(ordersActivityView);
                placeHolder.removeView(accountActivityView);

                if (item.getItemId() == R.id.action_home) {
                    placeHolder.addView(homeActivityView);
                    HomeActivity homeActivityClass = new HomeActivity(MainActivity.this);
//                    OnCreateHome();
//                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//                    startActivity(intent);
                } else if (item.getItemId() == R.id.action_account) {
                    placeHolder.addView(accountActivityView);
                } else if (item.getItemId() == R.id.action_orders) {
                    placeHolder.addView(ordersActivityView);
                }

                return true;
            }
        });

        bottomNav.setSelectedItemId(R.id.action_home);
    }

    private void OnCreateHome() {
        TextView txtView = homeActivityView.findViewById(R.id.textView3);
        txtView.setText("Edit");
    }
}