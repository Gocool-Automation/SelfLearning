package WMTInterview;

public class WmtInterview {
    //To find upper case & lower case count from string A234%$5abcW

    public static void main(String args[]) {
        String s = "A234%$5abcW";
        char c[] = s.toCharArray();
        int upperCount = 0, lowerCount = 0, specialCount = 0, numCount = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i]))
                if (Character.isUpperCase(c[i]))
                    upperCount = upperCount + 1;
                else
                    lowerCount = lowerCount + 1;
            else if (Character.isDigit(c[i]))
                numCount = numCount + 1;
            else
                specialCount = specialCount + 1;
        }
        System.out.println("Upper Count = " + upperCount);
        System.out.println("Lower Count = " + lowerCount);
        System.out.println("Special Count = " + specialCount);
        System.out.println("Number Count = " + numCount);
        System.out.println(1 + 2 + "a" + 4 + 5);
    }

}
