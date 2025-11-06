package Interview;

public class StringDemo {

    public static void main(String[] args) {
        String s = "abc";
        String s1 = "abc";

        if (s == s1)
            System.out.println("True");

        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println(s2 == s3);

    }

}
