import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeDeque {
    public static void main(String[] args) {
        String input = "RADAR";
        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters into Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Step 2 & 3: Remove first & last and compare
        // We continue as long as there's a pair to compare (size > 1)
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}






