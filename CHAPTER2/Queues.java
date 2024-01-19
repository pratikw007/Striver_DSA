// package CHAPTER2;

import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        // methods in Queues 
        // offer(E e)
        // peek() || element()
        // poll() 
        // poll();
        
        LinkedList<Integer>  q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        

        System.out.println(q.peek()); //1
        System.out.println(q.poll());// 1 - will also remove
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false -- check wheater it is empty or not
        System.out.println(q.size()); // 4 
        // System.out.println(q.element()); // throws an exception if the queue is empty
        System.out.println(q); // [2,3,4]




    }
}
