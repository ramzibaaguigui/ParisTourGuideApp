package com.ramzantest.paristourguideapp.Classes;

import com.ramzantest.paristourguideapp.R;

public class Hotel extends CallableTouristFacility {
    public Hotel(String name, String locationAddress, int pictureId, int averageVisitsPerDay, double rating, String supportPhoneNumber) {
        super(name, locationAddress, pictureId, averageVisitsPerDay, rating, supportPhoneNumber);
    }

    @Override
    public int getTypeStringId() {
        return R.string.hotel_string;
    }

    @Override
    public int getTypeIconId() {
        return R.drawable.ic_hotel;
    }
}
