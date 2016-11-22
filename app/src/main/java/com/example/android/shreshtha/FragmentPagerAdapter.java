package com.example.android.shreshtha;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by EMK Maker Lab on 11/22/2016.
 */
public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new SMSFragment();
        }else if(position == 1){
            return new CallFragment();
        }else{
            return new HotlineFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
