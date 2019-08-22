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
import com.ramzantest.paristourguideapp.Classes.Monument;
import com.ramzantest.paristourguideapp.R;

import java.util.ArrayList;

public class MonumentsFragment extends Fragment {
    private ArrayList<Monument> monuments;
    private FacilityRecyclerViewAdapter monumentsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillMonuments();
        monumentsAdapter = new FacilityRecyclerViewAdapter(getContext(), monuments);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView monumentsRecyclerView = (RecyclerView) inflater.inflate(R.layout.facilities_fragment, container, false);
        monumentsRecyclerView.setHasFixedSize(true);
        monumentsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        monumentsRecyclerView.setAdapter(monumentsAdapter);
        return monumentsRecyclerView;
    }

    private void fillMonuments() {
        monuments = new ArrayList<>();

        monuments.add(new Monument(
                getString(R.string.monument_1_name),
                getString(R.string.monument_1_location),
                R.drawable.monument_1_picture,
                22539,
                4.6,
                1806
        ));

        monuments.add(new Monument(
                getString(R.string.monument_2_name),
                getString(R.string.monument_2_location),
                R.drawable.monument_2_picture,
                22489,
                4.2,
                1840
        ));

        monuments.add(new Monument(
                getString(R.string.monument_3_name),
                getString(R.string.monument_3_location),
                R.drawable.monument_3_picture,
                17555,
                4.4,
                1508
        ));

        monuments.add(new Monument(
                getString(R.string.monument_4_name),
                getString(R.string.monument_4_location),
                R.drawable.monument_4_picture,
                9539,
                4.4,
                1886
        ));

        monuments.add(new Monument(
                getString(R.string.monument_5_name),
                getString(R.string.monument_5_location),
                R.drawable.monument_5_picture,
                9155,
                4.6,
                1639
        ));

        monuments.add(new Monument(
                getString(R.string.monument_6_name),
                getString(R.string.monument_6_location),
                R.drawable.monument_6_picture,
                2239,
                4.4,
                1411
        ));

        monuments.add(new Monument(
                getString(R.string.monument_7_name),
                getString(R.string.monument_7_location),
                R.drawable.monument_7_picture,
                5643,
                4.4,
                1686
        ));

        monuments.add(new Monument(
                getString(R.string.monument_8_name),
                getString(R.string.monument_8_location),
                R.drawable.monument_8_picture,
                11253,
                4.4,
                1774
        ));

        monuments.add(new Monument(
                getString(R.string.monument_9_name),
                getString(R.string.monument_9_location),
                R.drawable.monument_9_picture,
                19548,
                4.6,
                1806
        ));

        monuments.add(new Monument(
                getString(R.string.monument_10_name),
                getString(R.string.monument_10_location),
                R.drawable.monument_10_picture,
                30459,
                4.6,
                1887
        ));
    }
}
