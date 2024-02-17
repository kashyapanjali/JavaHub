import java.util.*;
//Time complexity O(n)
//Space complexity O(n)
public class PalindromeLL{
     static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
        }
    }
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Use a stack to store the first half of the linked list
        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the length of the linked list is odd, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the second half of the linked list with the elements in the stack
        while (slow != null) {
            if (slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        // Create a linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next =  new Node(1);
        

        if (isPalindrome(head)) {
            System.out.println("Linked list is a palindrome.");
        } else {
            System.out.println("Linked list is not a palindrome.");
        }
    }
}

