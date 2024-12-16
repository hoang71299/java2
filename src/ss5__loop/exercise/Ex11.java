package ss5__loop.exercise;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double sum = 0.0;


        for (int i = 1; i <= n; i++) {
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }

            sum += 1.0 / fact;
        }
        System.out.println("Kết quả: " + sum);
    }
}
