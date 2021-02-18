package com.satugenggam.aplikasi1.ui.view.order;

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

public class OrderPagerFragment extends FragmentPagerAdapter {

    private final Context mContext;

    OrderPagerFragment(Context context, FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new OrderInFragment();
                break;
            case 1:
                fragment = new OrderProsesFragment();
                break;
            case 2:
                fragment = new OrderSentFragment();
                break;
            case 3:
                fragment = new OrderArrivedFragment();
                break;
            case 4:
                fragment = new OrderDoneFragment();
                break;
            case 5:
                fragment = new OrderCancelledFragment();
                break;
            case 6:
                fragment = new OrderReturnFragment();
                break;
        }return fragment;
    }

    @Override
    public int getCount() {
        return 7;
    }

    @StringRes
    private final int[] TAB_TITLES = new int[]{
            R.string.tab_text_order_1,
            R.string.tab_text_order_2,
            R.string.tab_text_order_3,
            R.string.tab_text_order_4,
            R.string.tab_text_order_5,
            R.string.tab_text_order_6,
            R.string.tab_text_order_7
    };

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
}
