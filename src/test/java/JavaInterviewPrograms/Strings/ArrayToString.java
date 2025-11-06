package JavaInterviewPrograms.Strings;

import java.util.Arrays;

public class ArrayToString {

    public static void main(String[] args) {
        char c[] = {'a', 'p', 'p', 'l', 'e'};
        String[] strArray = {"My", "name", "is", "Gokulnath", "!"};

        //Using Arrays ToString()
        String a1 = Arrays.toString(c);
        String a2 = Arrays.toString(strArray);

        //Using StringBuilder append()
        StringBuilder stringBuilder = new StringBuilder();
        String b1 = null;
        for (int i = 0; i < strArray.length; i++) {
            b1 = stringBuilder.append(strArray[i]).toString();
        }

        //Using String Join()
        String c1 = String.join(" ", strArray);

        System.out.println("To String using toString : " + a2);
        System.out.println("To String using StringBuilder : " + b1);
        System.out.println("To String using String Join : " + c1);
    }
}
