public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "level";
        String reversed = "";

        // Loop: Iterating backwards from length - 1 down to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // String concatenation
        }

        // Comparison: Checking content, not memory address
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}



