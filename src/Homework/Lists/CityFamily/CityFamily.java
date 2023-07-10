package Homework.Lists.CityFamily;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityFamily {
    public static void main(String[] args) {
        Map<String, String> cityFamilyMap = new HashMap<>();
        cityFamilyMap.put("Moscow", "Ivanovy");
        cityFamilyMap.put("Kiev", "Petrovy");
        cityFamilyMap.put("London", "Abramovich");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter city to search: ");
        String city = sc.nextLine();
        String family = getFamily(cityFamilyMap, city);
        System.out.println("Family is: " + family);
    }

    public static String getFamily(Map<String, String> cityFamilyMap, String city){
        return cityFamilyMap.getOrDefault(city, "Not found");
    }
}
