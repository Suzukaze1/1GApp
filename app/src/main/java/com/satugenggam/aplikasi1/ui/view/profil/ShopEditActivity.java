package com.satugenggam.aplikasi1.ui.view.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.satugenggam.aplikasi1.R;

public class ShopEditActivity extends AppCompatActivity {

    Button btn_edit_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_edit);

        btn_edit_pass = findViewById(R.id.btn_edit_pass);

        btn_edit_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShopEditActivity.this, ShopChangePasswordActivity.class);
                startActivity(i);
            }
        });

        // Tombol Arah panah balik
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}