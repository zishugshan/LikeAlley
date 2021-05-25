package com.example.likealley.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.likealley.Fragments.NotificatifyFragment;
import com.example.likealley.Fragments.RequestFragment;

public class NotificationAdapter extends FragmentPagerAdapter {


    public NotificationAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new NotificatifyFragment();
            case 1: return new RequestFragment();
            default:return new NotificatifyFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0){
            title = "NOTIFICATION";
        }
        else if(position == 1){
            title = "REQUEST";
        }
        return title;
    }
}
