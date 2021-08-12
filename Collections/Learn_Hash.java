import java.util.*;


public class Learn_Hash {
    public static void main(String[] args)
    {
        Map <String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);
        numbers.put("Two", 23);
        numbers.putIfAbsent("Four", 4);
        System.out.println(numbers);

        // The key value gets override

        for(Map.Entry<String,Integer> entry : numbers.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry);
        }

        System.out.println(numbers.containsKey("Four"));
        System.out.println(numbers.containsValue(2));

    }
}
