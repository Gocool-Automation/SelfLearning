package JavaTraining.Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    //Doubly link list - maintains the address of predecessor and successor elements
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);

    }

}
