package com.ramzantest.paristourguideapp.Classes;

import com.ramzantest.paristourguideapp.R;

public class Monument extends TouristFacility {
    private int builtSince;

    public Monument(String name, String locationAddress, int pictureId, int averageVisitsPerDay, double rating, int builtSince) {
        super(name, locationAddress, pictureId, averageVisitsPerDay, rating);
        this.builtSince = builtSince;
    }

    public int getBuiltSince() {
        return builtSince;
    }

    @Override
    public int getTypeStringId() {
        return R.string.monument_string;
    }

    @Override
    public int getTypeIconId() {
        return R.drawable.ic_monument;
    }
}
