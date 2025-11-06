package JavaInterviewPrograms.Numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount1 {

    public static void main(String[] args) {
		/*
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the input string to count the words: ");
		String str = in.nextLine();
		in.close();
		*/

        System.out.println("Total words in the given input string is: " + wordCount("Gokulnath Sundaramoorthy") + "\n");
        System.out.println("Total words in the given input string is: " + wordCount1("Gokulnath Sundaramoorthy") + "\n");
        System.out.println("Total words in the given input string is: " + wordCount3("Gokulnath Kavitha SaiMithran") + "\n");

    }

    private static int wordCount3(String str) {
        int count = 0;
        for (String word : str.split("\\s+")) {
            count++;
        }
        return count;
    }

    public static int wordCount1(String str) {
        String[] strArr = str.split("\\s+");
        return strArr.length;

    }

    public static int wordCount(String str) {
        int count = 0;
        if (!str.isEmpty()) {
            count = 1;
            if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
                for (int i = 0; i < str.length(); i++) {
                    if ((str.charAt(i) == ' ') && !(str.charAt(i + 1) == ' ') && !(str.charAt(i + 1) == '\n')
                            && !(str.charAt(i + 1) == '\t'))
                        count++;
                }
            }
        } else
            System.out.println("Input String is NULL");

        return count;

    }

}
