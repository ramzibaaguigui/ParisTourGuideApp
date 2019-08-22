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
import com.ramzantest.paristourguideapp.Classes.Hotel;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    private ArrayList<Hotel> hotels;
    private FacilityRecyclerViewAdapter hotelsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillHotels();
        hotelsAdapter = new FacilityRecyclerViewAdapter(getContext(), hotels);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView hotelsRecyclerView = (RecyclerView) inflater.inflate(R.layout.facilities_fragment, container, false);
        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        hotelsRecyclerView.setAdapter(hotelsAdapter);
        return hotelsRecyclerView;
    }

    private void fillHotels() {
        hotels = new ArrayList<>();
        // todo: fill the arrayList of hotels

        hotels.add(new Hotel(
                getString(R.string.hotel_1_name),
                getString(R.string.hotel_1_location),
                R.drawable.hotel_1_picture,
                213,
                3.3,
                getString(R.string.hotel_1_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_2_name),
                getString(R.string.hotel_2_location),
                R.drawable.hotel_2_picture,
                180,
                3.3,
                getString(R.string.hotel_2_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_3_name),
                getString(R.string.hotel_3_location),
                R.drawable.hotel_3_picture,
                213,
                3.9,
                getString(R.string.hotel_3_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_4_name),
                getString(R.string.hotel_4_location),
                R.drawable.hotel_4_picture,
                365,
                3.3,
                getString(R.string.hotel_4_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_5_name),
                getString(R.string.hotel_5_location),
                R.drawable.hotel_5_picture,
                1238,
                3.5,
                getString(R.string.hotel_5_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_6_name),
                getString(R.string.hotel_6_location),
                R.drawable.hotel_6_picture,
                604,
                4.5,
                getString(R.string.hotel_6_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_7_name),
                getString(R.string.hotel_7_location),
                R.drawable.hotel_7_picture,
                381,
                3.5,
                getString(R.string.hotel_7_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_8_name),
                getString(R.string.hotel_8_location),
                R.drawable.hotel_8_picture,
                206,
                2.6,
                getString(R.string.hotel_8_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_9_name),
                getString(R.string.hotel_9_location),
                R.drawable.hotel_9_picture,
                255,
                3.9,
                getString(R.string.hotel_9_phone)
        ));


        hotels.add(new Hotel(
                getString(R.string.hotel_10_name),
                getString(R.string.hotel_10_location),
                R.drawable.hotel_10_picture,
                206,
                3,
                getString(R.string.hotel_10_phone)
        ));
    }
}
