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
    RelativeLayout mainLayout;
    //    ImageView btnHome;
    HomeActivity homeActivityClass;
    OrdersActivity ordersActivityClass;
    FloatingActionButton btnHome;
    CurvedBottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
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
                if (homeActivityView != null)
                    mainLayout.removeView(homeActivityView);
                if (ordersActivityView != null)
                    mainLayout.removeView(ordersActivityView);
                if (accountActivityView != null)
                    mainLayout.removeView(accountActivityView);

                if (item.getItemId() == R.id.action_home) {
                    GoToHome();
                } else if (item.getItemId() == R.id.action_orders) {
                    GoToOrders();
                } else if (item.getItemId() == R.id.action_account) {

                }

                return true;
            }
        });

        bottomNav.setSelectedItemId(R.id.action_home);
    }

    private void GoToHome() {
        if (homeActivityClass == null)
            homeActivityClass = new HomeActivity(MainActivity.this);

        homeActivityView = homeActivityClass.getView();
        mainLayout.addView(homeActivityView);
    }

    private void GoToOrders() {
        if (ordersActivityClass == null)
            ordersActivityClass = new OrdersActivity(MainActivity.this);

        ordersActivityView = ordersActivityClass.getView();
        mainLayout.addView(ordersActivityView);
    }
}