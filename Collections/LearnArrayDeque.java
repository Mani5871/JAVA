import java.util.ArrayDeque;
public class LearnArrayDeque {
    
    public static void main(String[] args)
    {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offerFirst(2);
        queue.offerLast(40);
        queue.offer(30);
        queue.offer(900);

        // offer and offerLast are same

        System.out.println(queue);
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollLast());

        System.out.println(queue);
    }
}
