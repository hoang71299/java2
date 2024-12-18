package ss5__loop.exercise;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");

        // hinh a
        for (int i = 1; i <= sc.nextInt(); i++) {
            for (int j = 1; j <= sc.nextInt(); j++) {
                if (i == 1 || i == sc.nextInt() || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh b
        for (int i = 1; i <= sc.nextInt(); i++) {
            for (int j = 1; j <= sc.nextInt(); j++) {
                if (i == 1 || i == sc.nextInt() || j == sc.nextInt() - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
