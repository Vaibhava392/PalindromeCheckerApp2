import java.util.*;

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean isValid(String input);
}

// 2. Concrete Strategy: Stack (LIFO approach)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null) return false;
        
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.equals(reversed.toString());
    }
}

// 3. Concrete Strategy: Deque (Double-Ended Queue approach)
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null || input.isEmpty()) return true;

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// 4. The Context Class (The Service)
class PalindromeService {
    private PalindromeStrategy strategy;

    // Constructor Injection
    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Runtime Strategy Injection (Setter)
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isValid(input);
    }
}

// 5. The Main Application
public class PalindromeCheckerApp2 {
    public static void main(String[] args) {
        String testInput = "Race Car";

        // Initialize with Stack Strategy
        PalindromeService service = new PalindromeService(new StackStrategy());
        System.out.println("[Stack Strategy] Is '" + testInput + "' a palindrome? " + service.check(testInput));

        // Swap to Deque Strategy at runtime
        service.setStrategy(new DequeStrategy());
        System.out.println("[Deque Strategy] Is '" + testInput + "' a palindrome? " + service.check(testInput));
    }
}
