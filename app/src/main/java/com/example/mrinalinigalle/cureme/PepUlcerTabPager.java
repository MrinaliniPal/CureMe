package com.example.mrinalinigalle.cureme;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mrinalini galle on 21-03-2016.
 */
public class PepUlcerTabPager extends FragmentPagerAdapter {

    public PepUlcerTabPager(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }
    // Holds tab titles
    private String tabTitles[] = new String[] { "Disease Information", "Home Remedy", "Emergency Condition" };


    @Override
    public int getCount() {
        return 3;
    }

    // Return the correct Fragment based on index
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new PepUlcerFrag1();
        } else if(position == 1) {
            return new PepUlcerFrag2();
        } else if(position == 2) {
            return new PepUlcerFrag3();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the tab title to SlidingTabLayout
        return tabTitles[position];
    }
}
