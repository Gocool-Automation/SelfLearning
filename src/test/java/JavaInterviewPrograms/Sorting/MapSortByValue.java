package JavaInterviewPrograms.Sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortByValue {

    public static void main(String[] args) {
        Map<String, String> unsortedMap = new HashMap<>();

        unsortedMap.put("Nepal", "Kathmandu");
        unsortedMap.put("India", "New Delhi");
        unsortedMap.put("United States", "Washington");
        unsortedMap.put("England", "London");
        unsortedMap.put("Australia", "Canberra");

        System.out.println("Original Map: " + unsortedMap);

        //Sort the map by Alphabet values in ascending order
        Map<String, String> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                //.sorted(Map.Entry.<String, String>comparingByValue().reversed()) //for reverse or descending sorting
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        //System.out.println("Alphabetically sorted map: " + sortedMap);
        sortedMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
