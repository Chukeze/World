package com.simworld.runworld;

import com.simworld.objects.Neighborhoods;
import com.simworld.objects.PlacesFramework;
import com.simworld.objects.User;

public class Main {

    public static void main(String[] args) {
    // write your code here
        //SignUp and login
        User sign_up = new User();
        sign_up.SignUp();
        User login = new User();
        login.Login();

        System.out.println("Hello Welcome to SimWorld, this is going to be an adventure");
        PlacesFramework placesFramework = new PlacesFramework();
        //com.simworld.objects.Process process = new com.simworld.objects.Process();
        placesFramework.locationReader();
        placesFramework.displayMap();
        Neighborhoods.CreateNeighborhood();


    }
}
