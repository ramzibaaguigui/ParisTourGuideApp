package com.ramzantest.paristourguideapp.Classes;

import com.ramzantest.paristourguideapp.R;

public class PublicGarden extends TouristFacility {
    int areaInSquareMetre;

    public PublicGarden(String name, String locationAddress, int pictureId, int averageVisitsPerDay, double rating, int areaInSquareMetre) {
        super(name, locationAddress, pictureId, averageVisitsPerDay, rating);
        this.areaInSquareMetre = areaInSquareMetre;
    }

    public int getAreaInSquareMetre() {
        return areaInSquareMetre;
    }

    @Override
    public int getTypeStringId() {
        return R.string.public_garden_string;
    }

    @Override
    public int getTypeIconId() {
        return R.drawable.ic_public_garden;
    }
}
