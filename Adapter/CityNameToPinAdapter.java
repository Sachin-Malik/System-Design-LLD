package Adapter;

import java.util.HashMap;

public class CityNameToPinAdapter {

    HashMap<String, String> cityNamePinMap;

    CityNameToPinAdapter() {
        cityNamePinMap = new HashMap<String, String>();
        cityNamePinMap.put("Jaipur", "1211");
        cityNamePinMap.put("Delhi", "4532");
        cityNamePinMap.put("Mumbai", "1178");
    }

    public String getPin(String cityName) {
        if (cityNamePinMap.containsKey(cityName)) {
            return cityNamePinMap.get(cityName);
        }
        return "Not Found";
    }

}
