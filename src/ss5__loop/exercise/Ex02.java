package ss5__loop.exercise;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so n ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i = i+2) {
            System.out.println(i + "\t");
        }
    }
}
