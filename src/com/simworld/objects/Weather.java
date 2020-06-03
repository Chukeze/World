package com.simworld.objects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Weather {
    Neighborhoods neighborhoods = new Neighborhoods();
    String[] weather = {"Sunny", "Cloudy", "Misty", "Windy", "Rainy",};
    public  void weatherTypes() {
        List<String> WeatherTypes = Arrays.asList(weather);
        List<String> immutable = Collections.unmodifiableList(WeatherTypes);
        immutable.add("grayer");
    }

    public String[] getWeather() {//randomly generate weather for each place per time peroid
        weatherTypes();
        temperature();
        return weather;
    }

    private void temperature() {

    }

    public void setWeather(){//set the weather chosen
        for (place:neighborhoods) {
            setWeather();

        }
    }
}
