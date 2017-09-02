package com.example.thagadur.android_session10_assignment3;

/**
 * Created by Thagadur on 8/18/2017.
 */

public class ListModel {
    private String vName;
    private String vId;
    private int imageId;

    //getters method
    public String getvName() {
        return vName;
    }

    public String getvId() {
        return vId;
    }

    public int getImageId() {
        return imageId;
    }

    //setters method
    public void setvId(String vId) {
        this.vId = vId;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
