package com.ramzantest.paristourguideapp.Classes;

public abstract class TouristFacility {
    private String name;
    private String locationAddress;
    int pictureId;
    int averageVisitsPerDay;
    double rating;

    public TouristFacility(String name, String locationAddress, int pictureId, int averageVisitsPerDay, double rating) {
        this.name = name;
        this.locationAddress = locationAddress;
        this.pictureId = pictureId;
        this.averageVisitsPerDay = averageVisitsPerDay;
        this.rating = rating;
    }

    /**
     * returns the name of the facility
     */
    public String getName() {
        return name;
    }

    /**
     * returns the location address of the facility
     */
    public String getLocationAddress() {
        return locationAddress;
    }

    /**
     * returns the id referring to the facility picture
     */
    public int getPictureId() {
        return pictureId;
    }

    /**
     * returns the number of visits that the facility gets per day
     */
    public int getAverageVisitsPerDay() {
        return averageVisitsPerDay;
    }

    /**
     * returns the facility rating out of 5
     */
    public double getRating() {
        return rating;
    }

    /**
     * returns the id referring to the string that expresses the type of tha facility
     */
    public abstract int getTypeStringId();

    /**
     * returns the id referring to drawable that expresses the type of the facility
     */
    public abstract int getTypeIconId();
}
