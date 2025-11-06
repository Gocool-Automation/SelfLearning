package Interview;

import java.util.HashMap;
import java.util.Map.*;

public class CountDemo {

    public static void main(String[] args) {

        String fruits[] = {"apple", "mango", "pear", "apple", "apple"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String fruit : fruits) {
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                map.put(fruit, 1);
            }
        }
        System.out.println(map);
        for(Entry<String, Integer> entry : map.entrySet() ) {
            if(entry.getValue() > 0)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
