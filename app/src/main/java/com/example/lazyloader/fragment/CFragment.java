package com.example.lazyloader.fragment;

import android.util.Log;
import android.view.View;

import com.example.lazyloader.R;

public class CFragment extends AbsBaseFragment {
    @Override
    protected int getRootLayout() {
        return R.layout.fragment_layout_c;
    }

    @Override
    protected void initView(View rootView) {
        Log.i(TAG, "initView: " + this.getClass().getSimpleName());
    }
}
