package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    View homeActivityView, ordersActivityView, accountActivityView;
    ImageView btnHome;
    HomeActivity homeActivityClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout placeHolder = findViewById(R.id.mainLayout);
        homeActivityView = (new HomeActivity(MainActivity.this)).getView();
        ordersActivityView = View.inflate(this, R.layout.activity_orders, null);
        accountActivityView = View.inflate(this, R.layout.activity_account, null);
        btnHome = findViewById(R.id.imgHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                placeHolder.removeView(homeActivityView);
                placeHolder.removeView(ordersActivityView);
                placeHolder.removeView(accountActivityView);
                placeHolder.addView(homeActivityView);
                if (homeActivityClass == null)
                    homeActivityClass = new HomeActivity(MainActivity.this);
            }
        });


//        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
//        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                placeHolder.removeView(homeActivityView);
//                placeHolder.removeView(ordersActivityView);
//                placeHolder.removeView(accountActivityView);
//
//                if (item.getItemId() == R.id.action_home) {
//                    placeHolder.addView(homeActivityView);
//                    HomeActivity homeActivityClass = new HomeActivity(MainActivity.this);
//                } else if (item.getItemId() == R.id.action_account) {
//                    placeHolder.addView(accountActivityView);
//                } else if (item.getItemId() == R.id.action_orders) {
//                    placeHolder.addView(ordersActivityView);
//                }
//
//                return true;
//            }
//        });

//        bottomNav.setSelectedItemId(R.id.action_home);
    }
}