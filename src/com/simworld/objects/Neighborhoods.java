package com.simworld.objects;

import java.util.HashMap;
import java.util.Map;

public class Neighborhoods{//makes the neighborhoods

       public static void CreateNeighborhood(){
              Neighborhoods creatingNeighborhood = new Neighborhoods();
              for (creatingNeighborhood){//assigns the neighborhood type after creation
                     NeighborhoodType();
                     for (int i =0; i < 5; i++){
                                 String neighborhoodName= "hh";//get name from a outside directory/textfile.
                          }
              }

       }

       //Using map
       public static void NeighborhoodType(){
              String[] middleClass = {"Rich Urban","Suburb"};
              String Ghetto = "Ghetto";
              String Elite = "Elite";
              String CrimeCity= "Crime City";
              Map<Object, String> NeighborhoodType = new HashMap<>();// i could specify the key to string but one of the key is a string array so using generic object is the solution i found
              NeighborhoodType.put(middleClass,"Suburb");
              NeighborhoodType.put(Ghetto, "Ghetto");
              NeighborhoodType.put(Elite, "Elite");
              NeighborhoodType.put(CrimeCity,"Crime City");

       }
}
