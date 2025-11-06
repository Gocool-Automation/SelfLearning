package JavaInterviewPrograms.Strings;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Triangle";
        String str2 = "angleTri";

        boolean match = false;

        if (str1.length() != str2.length()) {
            System.out.println("Given string is not an anagram");
        } else {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            match = Arrays.equals(c1, c2);

            /*
            for(int i = 0; i < c1.length; i++) {
                c1[i] = c2[i];
                match = true;
            }
             */
        }
        if (match == true)
            System.out.println("Given strings " + str1 + " and " + str2 + " are Anagram");
        else
            System.out.println("Given strings are not anagram");
    }
}
