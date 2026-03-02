public class NormalizedPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        // 1. Normalize the string
        // [^a-zA-Z0-9] means "anything NOT a letter or number"
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + cleanInput);

        // 2. Apply comparison logic (UC9 Recursion style)
        boolean result = isPalindrome(cleanInput, 0, cleanInput.length() - 1);

        System.out.println("Is Palindrome? " + result);
    }

    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }
}








