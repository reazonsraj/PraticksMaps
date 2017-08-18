package com.example.reaz.mapsgps.activitees.model;

/**
 * Created by reaz on 8/17/2017.
 */

public class Devslopes {


    private float longitude;
    private float latitude;
    private String locationTitle;
    private String locationAddress;

    public Devslopes(float longitude, float latitude, String locationTitle, String locationAddress, String locationImrUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationImrUrl = locationImrUrl;
    }

    private String locationImrUrl;
}
