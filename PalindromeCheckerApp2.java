public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        System.out.println("Input: " + input);

        // UC13: Performance Comparison
        compareAlgorithms(input);
    }

    /**
     * Compares the execution time of two different palindrome algorithms.
     */
    public static void compareAlgorithms(String str) {
        // Algorithm 1: Two-Pointer (Manual check)
        long start1 = System.nanoTime();
        boolean isPal1 = isPalindromeManual(str);
        long end1 = System.nanoTime();

        System.out.println("--- Two-Pointer Approach ---");
        System.out.println("Is Palindrome? : " + isPal1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        // Algorithm 2: StringBuilder Reverse
        long start2 = System.nanoTime();
        boolean isPal2 = isPalindromeReverse(str);
        long end2 = System.nanoTime();

        System.out.println("\n--- StringBuilder Approach ---");
        System.out.println("Is Palindrome? : " + isPal2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");
    }

    /**
     * Algorithm 1: Efficiently checks characters from both ends.
     * Complexity: O(n) time, O(1) space.
     */
    public static boolean isPalindromeManual(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Algorithm 2: Uses built-in Java methods to reverse the string.
     * Complexity: O(n) time, O(n) space (due to new String creation).
     */
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}









