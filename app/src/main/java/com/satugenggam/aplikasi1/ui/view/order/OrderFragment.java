package com.satugenggam.aplikasi1.ui.view.order;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.satugenggam.aplikasi1.R;

public class OrderFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    public OrderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tabLayout = container.findViewById(R.id.tab_layout_order);
        viewPager = container.findViewById(R.id.view_pager_order);
        viewPager.setOffscreenPageLimit(7);
        viewPager.setAdapter(new OrderPagerFragment(getContext(), getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_order, container, false);
    }
}