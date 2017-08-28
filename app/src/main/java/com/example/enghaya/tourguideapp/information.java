package com.example.enghaya.tourguideapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by ENG.HAYA on 8/21/2017 AD.
 */

public class information {
    String name;
    int image;
    String address;
    String location;

    public information(String string, String s, String name, String address, String location) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.image = image;
    }
    public information(Context context, ArrayList<information> info) {

    }

    public information(String string2, String s1, String string, String s, String string1, int de) {


    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
