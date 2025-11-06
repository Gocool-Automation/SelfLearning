package Screening;

import java.util.HashMap;

public class sample {
    public static void main(String[] args) {
        String s = "Hello there";
        //Find the occurence of the input
        char[] ch = s.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : ch) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+ 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.print(map);

    }
}
