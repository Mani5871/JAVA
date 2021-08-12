import java.util.*;
public class LearnSet {
    public static void main(String[] args)
    {
        Set <Integer> set = new HashSet<>();

        System.out.println(set.isEmpty());

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains(1));

        set.clear();

        // Difference between HashSet and LinkedHashSet is : HashSet order of insertion is unpredictable, while LinkedHashSet maintain same order
        // HashSet search operation take O(1) time. while LinkedHashSet takes O(Logn)
    }
}
