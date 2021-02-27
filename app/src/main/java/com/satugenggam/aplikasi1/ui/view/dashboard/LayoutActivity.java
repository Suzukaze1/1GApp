package com.satugenggam.aplikasi1.ui.view.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.satugenggam.aplikasi1.R;
import com.satugenggam.aplikasi1.ui.viewmodel.DashboardViewModel;

public class LayoutActivity extends AppCompatActivity {

    DashboardViewModel dashboardViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        setupUI();
        setupViewModel();
        setupObserve();
    }

    private void setupUI() {

    }

    private void setupViewModel(){
        dashboardViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DashboardViewModel.class);
    }

    private void setupObserve() {

    }
}