import java.util.*;
public class Queue_demo {
    public static void main(String[] args)
    {
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.offer(6);

        // Add throws an exception if memory is full. But offer returns false;
        // Similar case with remove and poll while removing the element 
        // Similar case with element and peek while looking at the next element

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
