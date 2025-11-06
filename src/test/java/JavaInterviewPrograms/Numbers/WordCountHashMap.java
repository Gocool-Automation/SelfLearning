package JavaInterviewPrograms.Numbers;

import java.util.HashMap;
import java.util.Map;

public class WordCountHashMap {

    public static void main(String[] args) {
        String str = "Alice alice is girl   and Bob bob is boy";
        Map<String, Integer> map = new HashMap<>();
        String words[] = str.toLowerCase().split("\\s+");

        for (String word : words) {
            /*
             * if (hashMap.containsKey(word))
             * hashMap.put(word, hashMap.get(word) + 1);
             * else
             * hashMap.put(word, 1);
             */
            Integer integer = map.get(word);
            if (integer == null)
                map.put(word, 1);
            else
                map.put(word, integer + 1);

        }
        System.out.println("Total words in the input string is::" + map);

    }

}
