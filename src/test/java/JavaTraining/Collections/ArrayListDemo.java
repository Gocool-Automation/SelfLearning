package JavaTraining.Collections;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("abc");
        al.add(10);
        al.add(10.5);


        System.out.println(al);
        al.add(2, 20);
        al.add(3, 30);
        al.add(5, 50);
        System.out.println(al);
        System.out.println(al.get(4));
        String[] array = {"Apple", "Banana"};
        al.add(array[0]);
        al.add(array[1]);

        System.out.println(al);
        try{
            System.out.println(al.get(10));
        } catch (ArrayIndexOutOfBoundsException e) {
            log.error("e: ", e);
        }

    }

}
