package operation;

public class EvaluateAndAddWatchDemo {
    public static void main(String[] args) {
        String[] words = {
                "Polymorphism",     // 13 characters
                "Encapsulation",    // 14 characters
                "Multithreading"    // 14 characters
        };

        System.out.println("words are ready."); // set a breakpoint here and evaluate

        // Print the words array
        for (String word : words) {
            System.out.println(word); // set a breakpoint here and add a watch
        }
    }
}
