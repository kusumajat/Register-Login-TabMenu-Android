package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabAdapter extends FragmentStateAdapter {
    public TabAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            FirstFragment ff = new FirstFragment();
            return ff;
        } else if (position == 1) {
            SecondFragment sf = new SecondFragment();
            return sf;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
