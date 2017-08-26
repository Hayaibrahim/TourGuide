package com.example.enghaya.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ENG.HAYA on 8/26/2017 AD.
 */

public class SectionsPagerAdapter extends AppCompatActivity  {


    public SectionsPagerAdapter(FragmentManager supportFragmentManager) {

    }

    public Fragment getItem(int position) {
        return null;
    }

    public int getCount() {
        return 4;
    }
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "CLINIC";
            case 1:
                return "UNVERSITY";
            case 2:
                return "SUPER MARKET";
            case 3:
                return "COFFEE SHOP";
        }
        return null;
    }
}
