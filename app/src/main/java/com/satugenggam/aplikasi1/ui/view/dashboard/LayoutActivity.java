package com.satugenggam.aplikasi1.ui.view.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.satugenggam.aplikasi1.R;
import com.satugenggam.aplikasi1.ui.view.order.BlankFragment;
import com.satugenggam.aplikasi1.ui.view.order.OrderActivity;
import com.satugenggam.aplikasi1.ui.view.order.OrderFragment;

public class LayoutActivity extends AppCompatActivity {

    private Fragment fragment = new DashboardFragment();
    ActionBarDrawerToggle mDrawableToggle;
    DrawerLayout mDrawerLayout;
    Button btnOrder, btnDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        mDrawerLayout = findViewById(R.id.drawer_layout01);
        btnDashboard = findViewById(R.id.btn_beranda);
        btnOrder = findViewById(R.id.btn_pesanan);

        mDrawableToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawerOpen, R.string.drawerClose);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container1, fragment).commit();

        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawers();
                Fragment fragment = new DashboardFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, fragment).commit();
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.closeDrawers();
                Fragment fragment = new OrderFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container1, fragment).commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shop_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item != null && item.getItemId() == R.id.fav_btn) {
            if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                mDrawerLayout.closeDrawer(Gravity.RIGHT);
            }
            else {
                mDrawerLayout.openDrawer(Gravity.RIGHT);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}