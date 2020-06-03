package com.simworld.objects;

import java.util.Scanner;

public class Vehicles {
    //created with guava immutable which make the object stay the same especially if using 3rd party api

    public void Vehicles(){
        String VehicleClassification[] = {"One Wheel", "Two Wheel", "AirBorne", "WaterBorne",};
        String VehicleType[] = {"Car", "Ship", "Boat","Bike","Plane",};
        ImmutableList<String> VehicleClassifications = ImmutableList.of(VehicleClassification,VehicleType);
    }
    public void handles(){
        Scanner handlescanner = new Scanner(System.getProperty("find this"));
        Boolean hae= handlescanner.nextBoolean();
        handlescanner.close();

    }


}
