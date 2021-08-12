import java.util.*;
public class Prior_Queue {
    public static void main(String[] s)
    {
        Queue <Integer> pq = new PriorityQueue <>();
        pq.offer(20);
        pq.offer(40);
        pq.offer(30);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        // The below priority queue acts as a min heap
        Queue <Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());

        pqr.offer(20);
        pqr.offer(15);
        pqr.offer(10);
        pqr.offer(55);

        System.out.println(pqr);

    }
}
