package com.satugenggam.aplikasi1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class RegisterTabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EditText namalengkap,email,password,konfirmasi_password;
        Button btndaftar;
        ImageView iv02;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.register_tab_fragment, container, false);

        namalengkap = root.findViewById(R.id.register_full_name);
        email = root.findViewById(R.id.register_email);
        password = root.findViewById(R.id.register_pass);
        konfirmasi_password = root.findViewById(R.id.register_verification_pass);
        iv02 = root.findViewById(R.id.iv_register);
        btndaftar = root.findViewById(R.id.btn_register);

        namalengkap.setTranslationY(300);
        email.setTranslationY(300);
        password.setTranslationY(300);
        konfirmasi_password.setTranslationY(300);
        iv02.setTranslationY(300);
        btndaftar.setTranslationY(300);

        namalengkap.setAlpha(0);
        email.setAlpha(0);
        password.setAlpha(0);
        konfirmasi_password.setAlpha(0);
        btndaftar.setAlpha(0);

        iv02.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        namalengkap.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        konfirmasi_password.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        btndaftar.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Berhasil Menekan Tombol Daftar ", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
