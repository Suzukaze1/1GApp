package com.satugenggam.aplikasi1.ui.view.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import com.satugenggam.aplikasi1.R;

public class ShopProfileActivity extends AppCompatActivity {

    ImageView iv_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_profile);

        iv_edit = findViewById(R.id.iv_edit);

        iv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShopProfileActivity.this, ShopEditActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.shop_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}