package com.example.letsplay;

import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    PagerAdapter mPagerAdapter;
    TabLayout mTabLayout;
    ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("EROS MUSIC");

        mViewPager = findViewById(R.id.pager);

        mPagerAdapter = new PagerAdapter(getSupportFragmentManager()); // call the pager class
        mViewPager.setAdapter(mPagerAdapter); // set adapter for pager

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }


}
