package com.example.lazyloader.fragment;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TestPagerAdapter extends FragmentStatePagerAdapter {
    private List<AbsBaseFragment> mFragments;
    protected String TAG = "AbsBaseFragment";

    public TestPagerAdapter(FragmentManager fm, List<AbsBaseFragment> fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Log.i(TAG, "instantiateItem: " + this.getClass().getSimpleName() + " " + mFragments.get(position).getClass().getSimpleName());
        return super.instantiateItem(container, position);
    }

    @Override
    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        Log.i(TAG, "setPrimaryItem: " + this.getClass().getSimpleName() + " " + mFragments.get(position).getClass().getSimpleName());
        super.setPrimaryItem(container, position, object);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
