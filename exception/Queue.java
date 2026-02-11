package exception;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //queue ->0.001 use in automation
        //FIFO
        PriorityQueue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
