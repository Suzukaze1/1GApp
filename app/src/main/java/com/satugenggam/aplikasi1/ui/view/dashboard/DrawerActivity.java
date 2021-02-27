package com.satugenggam.aplikasi1.ui.view.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.satugenggam.aplikasi1.R;
import com.satugenggam.aplikasi1.databinding.ActivityDrawerBinding;
import com.satugenggam.aplikasi1.databinding.ActivityMainBinding;
import com.satugenggam.aplikasi1.ui.view.order.OrderFragment;

public class DrawerActivity extends AppCompatActivity {

    private ActivityDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDrawerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnPesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment();
            }
        });
    }

    private void openFragment() {
        OrderFragment fragment = new OrderFragment();
    }
}