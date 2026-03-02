import java.util.Scanner;

public class PalindromeChecker {
    private static final String APP_NAME = "Palindrome Sentinel";
    private static final String VERSION = "1.1.0";

    public static void main(String[] args) {
        displayHeader();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase to check: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\nSUCCESS: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\nFAILURE: \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println("\nThank you for using " + APP_NAME + ". Goodbye!");
        scanner.close();
    }

    private static void displayHeader() {
        System.out.println("************************************");
        System.out.println("   " + APP_NAME.toUpperCase());
        System.out.println("   Version: " + VERSION);
        System.out.println("************************************");
    }

    private static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (clean.isEmpty()) return false;

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.equals(reversed);
    }
}

