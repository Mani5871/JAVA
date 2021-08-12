import java.util.ArrayList;
import java.util.*;

public class Array
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0, 1);
        list.add(4);
        // Size grows from n , n /2 + 1 and so on

        System.out.println(list);
        System.out.println(list.get(2));

        list.remove(4);
        System.out.println(list);

        List <Integer> new_list = new ArrayList<Integer>();
        new_list.addAll(list);
        System.out.println(new_list);

        new_list.remove(Integer.valueOf(3));
        System.out.println(new_list);

        list.set(2, 1000);
        System.out.println(list);

        System.out.println(list.contains(2));

        for(Integer i : list)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator <Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        
        System.out.println();
        
        // ArrayDequeue <Integer> queue = new ArrayDeque<>();
        // queue.offer(20);
        // queue.offerFirst(30);
    }
}