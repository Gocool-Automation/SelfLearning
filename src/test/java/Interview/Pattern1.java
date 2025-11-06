package Interview;

public class Pattern1 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" " + "*");
            }
           if (i != n - 1)
                System.out.println();
        }

    }

}
