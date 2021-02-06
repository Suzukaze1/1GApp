package com.satugenggam.aplikasi1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        EditText email,pass;
        TextView forgetpass;
        Button btnlogin;
        ImageView iv01;
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        email = root.findViewById(R.id.login_email);
        pass = root.findViewById(R.id.login_pass);
        iv01 = root.findViewById(R.id.iv_login);
        forgetpass = root.findViewById(R.id.tv_lupa_password);
        btnlogin = root.findViewById(R.id.btn_login);

        email.setTranslationY(300);
        pass.setTranslationY(300);
        iv01.setTranslationY(300);
        forgetpass.setTranslationY(300);
        btnlogin.setTranslationY(300);

        email.setAlpha(0);
        pass.setAlpha(0);
        forgetpass.setAlpha(0);
        btnlogin.setAlpha(0);

        iv01.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(200).start();
        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgetpass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btnlogin.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
