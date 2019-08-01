package com.example.lazyloader.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class AbsBaseFragment extends Fragment {
    private View mRootView;
    protected String TAG = "AbsBaseFragment";

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            Log.i(TAG, "setUserVisibleHint: " + this.getClass().getSimpleName() + " isVisibleToUser = " + isVisibleToUser);
            pageOnShow();
        } else {
            Log.i(TAG, "setUserVisibleHint: " + this.getClass().getSimpleName() + " isVisibleToUser = " + isVisibleToUser);
            pageOnHidden();
        }
    }

    protected void pageOnHidden() {
//        Log.i(TAG, "pageOnHidden: " + this.getClass().getSimpleName() + "  " + mRootView);
    }

    protected void pageOnShow() {
//        Log.i(TAG, "pageOnShow: " + this.getClass().getSimpleName() + "  " + mRootView);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.i(TAG, "onHiddenChanged: " + this.getClass().getSimpleName());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            Log.i(TAG, "onCreateView: 0 " + this.getClass().getSimpleName());
            mRootView = inflater.inflate(getRootLayout(), null);
            initView(mRootView);
        }
        Log.i(TAG, "onCreateView: 1 " + this.getClass().getSimpleName());
        return mRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: " + this.getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: " + this.getClass().getSimpleName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: " + this.getClass().getSimpleName());
    }

    protected abstract int getRootLayout();

    protected abstract void initView(View rootView);


}
