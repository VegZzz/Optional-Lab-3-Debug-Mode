package intro;

import java.util.Scanner;

public class SimpleCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        if (x > y) {
            System.out.println("Result: x > y");
        } else if (x < y) {
            System.out.println("Result: x < y");
        } else {
            System.out.println("Result: x == y");
        }

        scanner.close();
    }
}
