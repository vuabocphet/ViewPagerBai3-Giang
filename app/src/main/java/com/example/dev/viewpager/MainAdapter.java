package com.example.dev.viewpager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainAdapter extends FragmentPagerAdapter {

    public MainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:

                return new FragmentA();
            case 1:
                    return new FragmentB();
            case 3:
                    return new FragmentC();
                default:
                    return new FragmentA();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "1";
            case 1:
                return "2";
            case 2:
                return "3";
                default:
                    return "1";
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }
}
