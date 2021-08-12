import java.util.*;
public class LearnArrayClass {
    public static void main(String[] s)
    {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println(index);

        int [] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(nums);
        
        for(int i : nums)
        {
            System.out.print(nums[i] + " ");
        }
    }
}
