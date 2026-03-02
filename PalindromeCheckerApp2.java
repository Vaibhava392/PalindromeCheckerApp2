import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 2: Pop and compare with the original string
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop(); // Returns the last pushed character
            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);
    }
}




