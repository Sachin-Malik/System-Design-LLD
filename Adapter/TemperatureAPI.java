package Adapter;

import java.util.HashMap;

public class TemperatureAPI {

    HashMap<String, String> tempHashMap;
    CityNameToPinAdapter cityNameToPinAdapter;

    TemperatureAPI() {
        cityNameToPinAdapter = new CityNameToPinAdapter();
        tempHashMap = new HashMap<String, String>();
        tempHashMap.put("1211", "21.C");
        tempHashMap.put("4532", "33.4C");
        tempHashMap.put("1178", "18.1C");
    }

    public String getTempByCityName(String cityName) {

        String pincode = cityNameToPinAdapter.getPin(cityName);
        if (tempHashMap.containsKey(pincode)) {
            return tempHashMap.get(pincode);
        }
        return "Not Found";
    }

}
