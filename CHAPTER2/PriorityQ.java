package CHAPTER2;

import java.util.*;
import java.util.PriorityQueue;

public class PriorityQ {
     public static void main(String[] args) {
        // PriorityQueue pq = new PriorityQueue<>(); // min PQ
        PriorityQueue pq = new PriorityQueue<>(Comparator.reverseOrder()); // min PQ

        pq.add(20);
        pq.add(9);
        pq.add(4);
        pq.add(2);
        System.out.println(pq.peek()); // 5 - the smallest element has  the highest priority queue
        System.out.println(pq);
        System.out.println(pq.poll()); // 2
        System.out.println(pq);


     }
}
