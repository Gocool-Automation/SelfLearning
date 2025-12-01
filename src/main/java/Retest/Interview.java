package Retest;

import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class Interview {

    //Find the duplicate characters from the given string

    public static void main(String[] args) {
        Map<String, String> unsortedMap = new HashMap<>();

        unsortedMap.put("Nepal", "Kathmandu");
        unsortedMap.put("India", "New Delhi");
        unsortedMap.put("United States", "Washington");
        unsortedMap.put("England", "London");
        unsortedMap.put("Australia", "Canberra");

        System.out.println(unsortedMap);

        Map<String ,String> sortedMapByKey = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1 , e2) -> e1,
                        LinkedHashMap::new
                ));

        Map<String ,String> sortedMapByValue = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1 , e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedMapByKey);
        System.out.println(sortedMapByValue);

    }
}
