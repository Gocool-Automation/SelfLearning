package Retest;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String str = "picture perfect";
        char[] ch = str.toLowerCase().toCharArray(); //use str.replace(" ", "") to remove the space between words
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : ch) {
            if(!Character.isWhitespace(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        //System.out.println(map);

        for(Map.Entry<Character,Integer> entrySet : map.entrySet()) {
            if(entrySet.getValue() >= 1) {
                System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
            }
        }
    }
}
