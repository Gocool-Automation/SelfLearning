package JavaTraining.Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(100);
        pq.add(300);
        pq.add(1000);
        pq.add(500);
        pq.add(200);
        pq.add(5000);
        System.out.println(pq);
    }
}
