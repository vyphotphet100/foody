package hcmute.edu.vn.caodinhsyvy_19110143.foody;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    View homeActivityView, ordersActivityView, accountActivityView;
    RelativeLayout placeHolder;
//    ImageView btnHome;
    HomeActivity homeActivityClass;
    FloatingActionButton btnHome;
    CurvedBottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeHolder = findViewById(R.id.mainLayout);
        homeActivityView = (new HomeActivity(MainActivity.this)).getView();
        ordersActivityView = View.inflate(this, R.layout.activity_orders, null);
        accountActivityView = View.inflate(this, R.layout.activity_account, null);
        btnHome = findViewById(R.id.btnHome);
        bottomNav = findViewById(R.id.bottomNav);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomNav.setSelectedItemId(R.id.action_home);
            }
        });

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                placeHolder.removeView(homeActivityView);
                placeHolder.removeView(ordersActivityView);
                placeHolder.removeView(accountActivityView);

                if (item.getItemId() == R.id.action_home) {
                    GoToHome();
                } else if (item.getItemId() == R.id.action_orders) {

                } else if (item.getItemId() == R.id.action_account) {

                }

                return true;
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

    private void GoToHome() {
        placeHolder.addView(homeActivityView);
        if (homeActivityClass == null)
            homeActivityClass = new HomeActivity(MainActivity.this);
    }
}