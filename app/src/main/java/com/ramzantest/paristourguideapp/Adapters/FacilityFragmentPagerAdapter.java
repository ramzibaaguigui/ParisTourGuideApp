package com.ramzantest.paristourguideapp.Adapters;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ramzantest.paristourguideapp.Fragments.CoffeeShopsFragment;
import com.ramzantest.paristourguideapp.Fragments.HotelsFragment;
import com.ramzantest.paristourguideapp.Fragments.MonumentsFragment;
import com.ramzantest.paristourguideapp.Fragments.PublicGardensFragment;
import com.ramzantest.paristourguideapp.Fragments.RestaurantsFragment;
import com.ramzantest.paristourguideapp.R;

public class FacilityFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public FacilityFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment returnedFragment;
        switch (position) {
            case 0:
                returnedFragment = new CoffeeShopsFragment();
                break;

            case 1:
                returnedFragment = new HotelsFragment();
                break;

            case 2:
                returnedFragment = new MonumentsFragment();
                break;

            case 3:
                returnedFragment = new PublicGardensFragment();
                break;

            case 4:
                returnedFragment = new RestaurantsFragment();
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }
        return returnedFragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String pageTitle;
        switch (position) {
            case 0:
                pageTitle = context.getString(R.string.coffeeshops_string);
                break;

            case 1:
                pageTitle = context.getString(R.string.hotels_string);
                break;

            case 2:
                pageTitle = context.getString(R.string.monuments_string);
                break;

            case 3:
                pageTitle = context.getString(R.string.public_gardens_string);
                break;

            case 4:
                pageTitle = context.getString(R.string.restaurants_string);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + position);
        }
        return pageTitle;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
