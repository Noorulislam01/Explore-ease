package com.example.travelapp;


public class PlaceModel {

    public  String name;
    public  String image;
    public PlaceModel(String name, String image){
        this.name = name;
        this.image = image;

    }


    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
