class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}

public class LinkedListPalindrome {
    public static void main(String[] args) {
        String input = "RADAR";
        Node head = convertToLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Find Middle using Slow/Fast pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the Second Half in-place
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // 3. Compare the two halves
        Node temp = secondHalf; // Keep reference to reverse back if needed
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static Node convertToLinkedList(String s) {
        Node dummy = new Node(' ');
        Node current = dummy;
        for (char c : s.toCharArray()) {
            current.next = new Node(c);
            current = current.next;
        }
        return dummy.next;
    }
}







