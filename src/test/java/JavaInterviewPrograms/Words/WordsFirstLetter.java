package JavaInterviewPrograms.Words;

public class WordsFirstLetter {
    public static void main(String[] args) {
        String str = "  Gokulnath   Sundaramoorthy";
        char c[] = str.toCharArray();

        System.out.print("The first letters of the words are : ");
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ')) {
                System.out.print(c[i]);
            }
        }
    }
}
