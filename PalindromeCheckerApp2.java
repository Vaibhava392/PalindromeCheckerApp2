class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Clean the input: remove non-alphanumeric and lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String testWord = "Racecar";
        boolean result = service.checkPalindrome(testWord);

        System.out.println("Is '" + testWord + "' a palindrome? " + result);
    }
}









