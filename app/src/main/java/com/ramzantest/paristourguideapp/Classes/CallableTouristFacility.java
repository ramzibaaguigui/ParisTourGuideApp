package com.ramzantest.paristourguideapp.Classes;

public abstract class CallableTouristFacility extends TouristFacility {
    private String supportPhoneNumber;

    public CallableTouristFacility(String name, String locationAddress, int pictureId, int averageVisitsPerDay, double rating, String supportPhoneNumber) {
        super(name, locationAddress, pictureId, averageVisitsPerDay, rating);
        this.supportPhoneNumber = supportPhoneNumber;
    }

    /**
     * returns the phone number
     */
    public String getSupportPhoneNumber() {
        return supportPhoneNumber;
    }
}
