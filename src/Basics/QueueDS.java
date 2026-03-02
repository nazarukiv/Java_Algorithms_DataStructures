package Basics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) {
        //FIFO (First-In First-Out)
        // dequeue (remove)
        //enqueue (add)

        Queue<String> queue = new LinkedList<>();
        queue.offer("Ivan");
        queue.offer("Tom");
        queue.offer("Kate");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);

    }
}
