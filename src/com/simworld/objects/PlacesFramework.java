package com.simworld.objects;
import java.text.DecimalFormat;
import java.util.*;

public class PlacesFramework {

    Map<String[],String> locations = new HashMap<>();

   //create a array list of locations. Then converts this string array into list object. Afterward it makes those list object immutable.
   public void AssignMapNames(){//responsible for assigning the name to the city objects
       String[] Cities = {"Chicago", "New York", "Los Angeles", "Minneapolis"};
       String[] Countries = {"Canada", "United States", "Mexico",};
       String[] Continent = {"North America","South America", "Europe",};
       locations.put(Cities,"  ");
       locations.put(Countries," ");
       locations.put(Continent," ");
       Map<String[], String> all_locations = new HashMap<String[], String>();// this take all previuous dicitionary and create a new one
       all_locations.putAll(locations);

       /**for (Continent: "North America", Cities:"Chicago", Countries) {
           System.out.println(Arrays.toString(Continent));
           System.out.println(Arrays.toString(Cities));
       }*/
       System.out.println("SimWorld" + all_locations);
       getLatitude();
       getLongitude();

   }
   public void displayMap(){//displays the map
       AssignMapNames();
       displayMap();
   }
   double[] currentLocation = new double[]{latitude,longitude};
   public static  double latitude;
   public static  double longitude;
   protected double getLatitude() {
        return latitude;
   }
   protected double getLongitude(){
        return longitude;
   }
   private void CurrentLocation() {//identifies the characters current location. This essentially the get currentlocation method
       Scanner scan_map = new Scanner(System.in);
       DecimalFormat decimalFormat = new DecimalFormat("0.##");
       latitude = scan_map.nextDouble();//right now these might be user prompted  inputs
       longitude = scan_map.nextDouble();
       scan_map.close();
       boolean coordinateFormat = Boolean.parseBoolean(null);//what does this do?
       if(coordinateFormat) {
           System.out.println("Your coordinate is" + decimalFormat.format(currentLocation));//extra assurance that it take the currentlocation and display in a decimal format,
       }else{
            double[] conversion = currentLocation;
            String location_name = Arrays.toString((conversion));//translate the coordinate from the current location into where country city, etc
           System.out.println(location_name);
       }

   }
    // this tell the character everything about the locations they are in
   public void locationReader(){
       CurrentLocation();//call currentlocation in the location reader so that it can be use in for loop and if statements
       this.CurrentLocation();//what does this do?
       Weather weather = new Weather();Neighborhoods.NeighborhoodType();
       User characterName = new User();//it suppose to call the character variable in the User class
       System.out.print(characterName + "Here are some information about this place"+ Arrays.toString(weather.getWeather()));
   }
}
