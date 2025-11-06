package JavaTraining.Collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al;
        al = new ArrayList();
        al.add("abc");
        al.add(10);
        al.add(10.5);

        System.out.println(al);
        al.add(2, 20);
        al.add(3, 30);
        al.add(5, 50);
        System.out.println(al);

    }

}
