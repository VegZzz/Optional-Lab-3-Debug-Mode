package intro;

import java.util.Scanner;

public class ComplicatedCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    for (int j = 0; j < i; j++) {
                        if (j % 2 == 1) {
                            sum += j;
                        }
                    }
                } else {
                    sum += i;
                }
            } else {
                for (int k = 1; k <= i; k++) {
                    if (k % 3 == 0) {
                        sum += k;
                    }
                }
            }
        }

        System.out.println("Final sum: " + sum);
        scanner.close();
    }
}