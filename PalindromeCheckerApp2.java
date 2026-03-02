public class RecursivePalindrome {
    public static void main(String[] args) {
        String input = "RADAR";

        // Initial call: passing the string, start index 0, and end index
        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }

    public static boolean isPalindrome(String s, int start, int end) {
        // Base Condition 1: If pointers meet or cross, we are done
        if (start >= end) {
            return true;
        }

        // Base Condition 2: If characters don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Call: Move inward by 1 from both sides
        return isPalindrome(s, start + 1, end - 1);
    }
}








