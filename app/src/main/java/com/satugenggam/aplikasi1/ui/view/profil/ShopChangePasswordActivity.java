package com.satugenggam.aplikasi1.ui.view.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.satugenggam.aplikasi1.R;

public class ShopChangePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_change_password);

        // Tombol Arah panah balik
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}