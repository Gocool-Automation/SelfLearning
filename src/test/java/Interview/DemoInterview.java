package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoInterview {
    //Java program to count letters occurrence
    public static void main(String[] args) {
        String s = "Gokulnath Sundaramoorthy";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char ch[] = s.toLowerCase().toCharArray();

        for (char c : ch) {
            if (Character.isLetter(c) && map.containsKey(c)) {
                //map.get(c);
                map.put(c, map.get(c) + 1);
            } else if (Character.isLetter(c))
                map.put(c, 1);
        }
        //System.out.println(map);

        for (Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > 0) {
                System.out.print(" " + m.getKey() + ":" + m.getValue());
            }
        }
        //Keyset or entryset check on map - to print the duplicate/more than one value key

    }

}
