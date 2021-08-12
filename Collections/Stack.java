// import java.util.*;
public class Stack {

    public static void main(String s[])
    {
        java.util.Stack<Integer> stack = new java.util.Stack<> ();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
