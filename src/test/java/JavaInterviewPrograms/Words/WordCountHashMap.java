package JavaInterviewPrograms.Words;

import java.util.StringTokenizer;

public class WordCountHashMap {

    public static void main(String[] args) {
        String str = "This is my Java world";
        System.out.println("Total words in the given string using Split() : " + countWordsUsingSplit(str));
        System.out.println("Total words in the given string using StringTokenizer() : " + countWOrdsUsingStringTokenizer(str));
        System.out.println("Total words in the given string without using any functions : " + countWords(" Gokulnath Kavitha SaiMithran "));
    }

    private static int countWords(String input) {
        if (input.isEmpty() || input == null) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = input.length() - 1;
        char[] characters = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    private static int countWOrdsUsingStringTokenizer(String input) {
        if (input.isEmpty() || input == null) {
            return 0;
        }
        StringTokenizer words = new StringTokenizer(input);
        return words.countTokens();
    }

    public static int countWordsUsingSplit(String input) {
        if (input.isEmpty() || input == null) {
            return 0;
        }
        String words[] = input.split("\\s+");
        return words.length;
    }
}
