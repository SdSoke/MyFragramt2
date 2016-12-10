package com.bignerdranch.admin.myfragramt;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by admin on 2016/12/10.
 */

public class Adapter extends FragmentPagerAdapter {
    public final int COUNT = 3;
    private String[] titles = new String[]{"Tab1", "Tab2", "Tab3"};
    private Context context;

    public Adapter(FragmentManager fm, MainActivity context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return OneFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
