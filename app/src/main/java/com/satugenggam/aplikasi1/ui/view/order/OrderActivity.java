package com.satugenggam.aplikasi1.ui.view.order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.satugenggam.aplikasi1.LoginAdapter;
import com.satugenggam.aplikasi1.R;

public class OrderActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tabLayout = findViewById(R.id.tab_layout_order);
        viewPager = findViewById(R.id.view_pager_order);

        viewPager.setOffscreenPageLimit(2);
        OrderPagerFragment adapter = new OrderPagerFragment(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}