import java.util.*;
public class next{
    public static void main(String args[]) { 
        int arr[] = { 6, 8, 1, 3, -1 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            //1step
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            //2step
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            //3step
            s.push(i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nextGreater[i]);
        }
        System.out.println();
    }
}
