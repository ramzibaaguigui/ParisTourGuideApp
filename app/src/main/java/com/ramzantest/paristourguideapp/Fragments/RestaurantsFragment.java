package com.ramzantest.paristourguideapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ramzantest.paristourguideapp.Adapters.FacilityRecyclerViewAdapter;
import com.ramzantest.paristourguideapp.Classes.Restaurant;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    private ArrayList<Restaurant> restaurants;
    private FacilityRecyclerViewAdapter restaurantsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillRestaurants();
        restaurantsAdapter = new FacilityRecyclerViewAdapter(getContext(), restaurants);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView restaurantsRecyclerView = (RecyclerView) inflater.inflate(R.layout.facilities_fragment, container, false);
        restaurantsRecyclerView.setHasFixedSize(true);
        restaurantsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        restaurantsRecyclerView.setAdapter(restaurantsAdapter);
        return restaurantsRecyclerView;
    }

    private void fillRestaurants() {
        restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_1_name),
                getString(R.string.restaurant_1_location),
                R.drawable.restaurant_1_picture,
                437,
                3.9,
                getString(R.string.restaurant_1_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_2_name),
                getString(R.string.restaurant_2_location),
                R.drawable.restaurant_2_picture,
                455,
                4.3,
                getString(R.string.restaurant_2_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_3_name),
                getString(R.string.restaurant_3_location),
                R.drawable.restaurant_3_picture,
                736,
                4.6,
                getString(R.string.restaurant_3_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_4_name),
                getString(R.string.restaurant_4_location),
                R.drawable.restaurant_4_picture,
                1022,
                4.9,
                getString(R.string.restaurant_4_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_5_name),
                getString(R.string.restaurant_5_location),
                R.drawable.restaurant_5_picture,
                1280,
                4.7,
                getString(R.string.restaurant_5_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_6_name),
                getString(R.string.restaurant_6_location),
                R.drawable.restaurant_6_picture,
                1322,
                4.8,
                getString(R.string.restaurant_6_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_7_name),
                getString(R.string.restaurant_7_location),
                R.drawable.restaurant_7_picture,
                1480,
                4.8,
                getString(R.string.restaurant_7_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_8_name),
                getString(R.string.restaurant_8_location),
                R.drawable.restaurant_8_picture,
                1275,
                5,
                getString(R.string.restaurant_8_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_9_name),
                getString(R.string.restaurant_9_location),
                R.drawable.restaurant_9_picture,
                1455,
                4.5,
                getString(R.string.restaurant_9_phone)
        ));

        restaurants.add(new Restaurant(
                getString(R.string.restaurant_10_name),
                getString(R.string.restaurant_10_location),
                R.drawable.restaurant_10_picture,
                831,
                4.6,
                getString(R.string.restaurant_10_phone)
        ));
    }
}
