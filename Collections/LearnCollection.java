import java.util.*;
public class LearnCollection {
    public static void main(String s[])
    {
        List <Integer> li = new ArrayList<> ();
        li.add (1);
        li.add (1);
        li.add (1);
        li.add (2);
        li.add (3);
        li.add (4);
        li.add (5);

        System.out.println(Collections.min(li));
        System.out.println(Collections.max(li));
        System.out.println(Collections.frequency(li, 1));

        Collections.sort(li, Comparator.reverseOrder());
        System.out.println(li);
    }
}
