package ss3_java_overview.exercise;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a :");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen b :");
        int b = scanner.nextInt();

        System.out.println("Tổng = " + (a + b));
        System.out.println("Hiệu = " + (a - b));
        System.out.println("Tích = " + (a * b));
        System.out.println("Thương = " + ((double)a / b));
    }
}
