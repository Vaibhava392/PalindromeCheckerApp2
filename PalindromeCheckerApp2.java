public class TwoPointerPalindrome {
    public static void main(String[] args) {
        String input = "racecar";

        // Convert String to character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        // Two-pointer loop
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break; // Optimization: Exit early if a mismatch is found
            }
            start++;
            end--;
        }

        System.out.println("Is palindrome: " + isPalindrome);
    }
}



