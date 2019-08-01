package com.example.lazyloader.fragment;

import android.util.Log;
import android.view.View;

import com.example.lazyloader.R;

public class BFragment extends AbsBaseFragment {
    @Override
    protected int getRootLayout() {
        return R.layout.fragment_layout_b;
    }

    @Override
    protected void initView(View rootView) {
        Log.i(TAG, "initView: " + this.getClass().getSimpleName());
    }
}
