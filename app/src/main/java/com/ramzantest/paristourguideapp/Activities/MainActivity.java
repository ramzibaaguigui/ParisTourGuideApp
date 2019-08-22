package com.ramzantest.paristourguideapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.ramzantest.paristourguideapp.Adapters.FacilityFragmentPagerAdapter;
import com.ramzantest.paristourguideapp.R;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning the view
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        // setting the adapter of the view pager so that it
        // shows the facility fragments
        viewPager.setAdapter(new FacilityFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this));

        // set up the tabLayout with the view Pager
        tabLayout.setupWithViewPager(viewPager);

    }
}
