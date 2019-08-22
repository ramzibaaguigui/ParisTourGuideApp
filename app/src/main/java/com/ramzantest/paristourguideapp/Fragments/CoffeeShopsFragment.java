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
import com.ramzantest.paristourguideapp.Classes.CoffeeShop;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class CoffeeShopsFragment extends Fragment {
    private ArrayList<CoffeeShop> coffeeShops;
    private FacilityRecyclerViewAdapter coffeeShopsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillCoffeeShops();
        coffeeShopsAdapter = new FacilityRecyclerViewAdapter(getContext(), coffeeShops);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView coffeeShopsRecyclerView = (RecyclerView) inflater.inflate(R.layout.facilities_fragment, container, false);
        coffeeShopsRecyclerView.setHasFixedSize(true);
        coffeeShopsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        coffeeShopsRecyclerView.setAdapter(coffeeShopsAdapter);
        return coffeeShopsRecyclerView;
    }

    private void fillCoffeeShops() {
        coffeeShops = new ArrayList<>();
        // TODO : fill the coffeeShops arrayList
        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_1_name),
                getString(R.string.coffeeshop_1_location),
                R.drawable.coffee_shop_1_picture,
                784,
                4.3,
                getString(R.string.coffeeshop_1_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_2_name),
                getString(R.string.coffeeshop_2_location),
                R.drawable.coffee_shop_2_picture,
                599,
                4.3,
                getString(R.string.coffeeshop_2_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_3_name),
                getString(R.string.coffeeshop_3_location),
                R.drawable.coffee_shop_3_picture,
                1178,
                4.3,
                getString(R.string.coffeeshop_3_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_4_name),
                getString(R.string.coffeeshop_4_location),
                R.drawable.coffee_shop_4_picture,
                542,
                4.6,
                getString(R.string.coffeeshop_4_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_5_name),
                getString(R.string.coffeeshop_5_location),
                R.drawable.coffee_shop_5_picture,
                461,
                4.6,
                getString(R.string.coffeeshop_5_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_6_name),
                getString(R.string.coffeeshop_6_location),
                R.drawable.coffee_shop_6_picture,
                477,
                4.3,
                getString(R.string.coffeeshop_6_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_7_name),
                getString(R.string.coffeeshop_7_location),
                R.drawable.coffee_shop_7_picture,
                633,
                4.7,
                getString(R.string.coffeeshop_7_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_8_name),
                getString(R.string.coffeeshop_8_location),
                R.drawable.coffee_shop_8_picture,
                574,
                4.5,
                getString(R.string.coffeeshop_8_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_9_name),
                getString(R.string.coffeeshop_9_location),
                R.drawable.coffee_shop_9_picture,
                966,
                4.8,
                getString(R.string.coffeeshop_9_phone)
        ));

        coffeeShops.add(new CoffeeShop(
                getString(R.string.coffeeshop_10_name),
                getString(R.string.coffeeshop_10_location),
                R.drawable.coffee_shop_10_picture,
                330,
                4.3,
                getString(R.string.coffeeshop_10_phone)
        ));


    }

}
