package com.example.lazyloader;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lazyloader.fragment.AFragment;
import com.example.lazyloader.fragment.AbsBaseFragment;
import com.example.lazyloader.fragment.BFragment;
import com.example.lazyloader.fragment.CFragment;
import com.example.lazyloader.fragment.DFragment;
import com.example.lazyloader.fragment.TestPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private AFragment mAFragment;
    private BFragment mBFragment;
    private CFragment mCFragment;
    private DFragment mDFragment;

    private List<AbsBaseFragment> mFragments = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.view_pager);

        mAFragment = new AFragment() ;
        mBFragment = new BFragment() ;
        mCFragment = new CFragment() ;
        mDFragment = new DFragment() ;
        mFragments.add(mAFragment);
        mFragments.add(mBFragment);
        mFragments.add(mCFragment);
        mFragments.add(mDFragment);
//        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setAdapter(new TestPagerAdapter(getSupportFragmentManager(),mFragments));
    }
}
