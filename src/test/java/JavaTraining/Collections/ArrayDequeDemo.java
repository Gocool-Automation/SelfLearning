package JavaTraining.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    //LIFO - Last Element In First Out
    public static void main(String[] args) {
        Deque<Integer> ad = new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        ad.add(400);
        ad.add(500);
        System.out.println(ad);
        ad.addFirst(1000);
        ad.addLast(2000);
        System.out.println(ad);
        ad.pop();
        ad.pop();
        System.out.println(ad);

    }

}
