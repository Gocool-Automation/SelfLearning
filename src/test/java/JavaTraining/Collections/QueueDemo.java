package JavaTraining.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
        //First in First Out
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
            queue.offer("abc");
            queue.offer("def");
            queue.offer("ghi");

            System.out.println(queue);
            queue.poll();
            System.out.println(queue);
    }
}
