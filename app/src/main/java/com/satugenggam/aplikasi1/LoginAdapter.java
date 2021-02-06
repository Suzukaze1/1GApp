package com.satugenggam.aplikasi1;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.satugenggam.aplikasi1.LoginTabFragment;
import com.satugenggam.aplikasi1.R;
import com.satugenggam.aplikasi1.RegisterTabFragment;

public class LoginAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    LoginAdapter(Context context, FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new RegisterTabFragment();
                break;
            case 1:
                fragment = new LoginTabFragment();
                break;
        }return fragment;
    }

    @StringRes
    private final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2
    };

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
}
