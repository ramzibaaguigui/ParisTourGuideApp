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
import com.ramzantest.paristourguideapp.Classes.PublicGarden;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class PublicGardensFragment extends Fragment {
    private ArrayList<PublicGarden> publicGardens;
    private FacilityRecyclerViewAdapter publicGardensAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillPublicGardens();
        publicGardensAdapter = new FacilityRecyclerViewAdapter(getContext(), publicGardens);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView publicGardensRecyclerView = (RecyclerView) inflater.inflate(R.layout.facilities_fragment, container, false);
        publicGardensRecyclerView.setHasFixedSize(true);
        publicGardensRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        publicGardensRecyclerView.setAdapter(publicGardensAdapter);
        return publicGardensRecyclerView;
    }

    private void fillPublicGardens() {
        publicGardens = new ArrayList<>();

        // TODO: fill the public gardens arrayList

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_1_name),
                getString(R.string.public_garden_1_location),
                R.drawable.public_garden_1_picture,
                58094,
                4.7,
                250000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_2_name),
                getString(R.string.public_garden_2_location),
                R.drawable.public_garden_2_picture,
                75000,
                4.5,
                235000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_3_name),
                getString(R.string.public_garden_3_location),
                R.drawable.public_garden_3_picture,
                25000,
                4.4,
                137000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.pubclic_garden_4_name),
                getString(R.string.public_garden_4_location),
                R.drawable.public_garden_4_picture,
                17780,
                4.6,
                76000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_5_name),
                getString(R.string.public_garden_5_location),
                R.drawable.public_garden_5_picture,
                25000,
                4.6,
                93930
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_6_name),
                getString(R.string.public_garden_6_location),
                R.drawable.public_garden_6_picture,
                12000,
                4.2,
                65000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_7_name),
                getString(R.string.public_garden_7_location),
                R.drawable.public_garden_7_picture,
                25000,
                4.3,
                140000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_8_name),
                getString(R.string.public_garden_8_location),
                R.drawable.public_garden_8_picture,
                10000,
                4.6,
                6100
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_9_name),
                getString(R.string.public_garden_9_location),
                R.drawable.public_garden_9_picture,
                19000,
                4.6,
                75000
        ));

        publicGardens.add(new PublicGarden(
                getString(R.string.public_garden_10_name),
                getString(R.string.public_garden_10_location),
                R.drawable.public_garden_10_picture,
                14850,
                4.5,
                250000
        ));
    }
}
