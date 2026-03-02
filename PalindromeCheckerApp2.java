import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructureDemo {
    public static void main(String[] args) {
        String input = "BOLT";

        // Initialize structures
        Queue<Character> queue = new LinkedList<>(); // Queue is an interface in Java
        Stack<Character> stack = new Stack<>();

        // 1. Loading the data
        System.out.println("Inputting characters: " + input);
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // 2. Comparison of Dequeue vs Pop
        System.out.println("\n--- Retrieval Comparison ---");
        System.out.printf("%-15s | %-15s%n", "Queue (FIFO)", "Stack (LIFO)");
        System.out.println("---------------------------------------");

        while (!queue.isEmpty()) {
            char qChar = queue.poll(); // Dequeue: removes from front
            char sChar = stack.pop();  // Pop: removes from top

            System.out.printf("%-15s | %-15s%n", qChar, sChar);
        }
    }
}





