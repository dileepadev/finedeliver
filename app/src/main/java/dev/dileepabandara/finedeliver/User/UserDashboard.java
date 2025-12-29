package dev.dileepabandara.finedeliver.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.WindowManager;

import dev.dileepabandara.finedeliver.R;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class UserDashboard extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu);

        // Default selected fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new UserHomeFragment())
                .commit();

        setupBottomMenu();
    }

    private void setupBottomMenu() {
        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int itemId) {
                Fragment fragment = null;

                if (itemId == R.id.bottom_nav_dashboard) {
                    fragment = new UserHomeFragment();
                } else if (itemId == R.id.bottom_nav_items) {
                    fragment = new UserItemsFragment();
                } else if (itemId == R.id.bottom_nav_profile) {
                    fragment = new UserProfileFragment();
                } else if (itemId == R.id.bottom_nav_notification) {
                    fragment = new UserNotificationsFragment();
                } else if (itemId == R.id.bottom_nav_settings) {
                    fragment = new UserSettingsFragment();
                }

                if (fragment != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, fragment)
                            .commit();
                }
            }
        });
    }
}