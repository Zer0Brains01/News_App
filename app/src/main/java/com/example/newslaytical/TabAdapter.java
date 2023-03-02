package com.example.newslaytical;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {
    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new frag1();
        }else if(position==1){
            return new Fra2();
        }else if(position==2){
            return new Frag3();
        }else {
            return new Frag4();
        }
        // return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "General";
        }else if (position==1){
            return "Entertainment";

        }else if(position==2){
            return "Sports";
        }else if(position==3) {
            return "Business";
        }
        else return super.getPageTitle(position);
    }
}
