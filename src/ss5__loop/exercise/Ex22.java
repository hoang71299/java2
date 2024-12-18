package ss5__loop.exercise;

import java.util.Scanner;

public class Ex22 {
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b (b > a): ");
        int b = scanner.nextInt();


        int countPalindrome = 0, sumPalindrome = 0;
        int countPerfectSquare = 0, sumPerfectSquare = 0;
        int countPrime = 0, sumPrime = 0;

        for (int i = a; i <= b; i++) {
            if (isPalindrome(i)) {
                countPalindrome++;
                sumPalindrome += i;
            }
            if (isPerfectSquare(i)) {
                countPerfectSquare++;
                sumPerfectSquare += i;

            }
            if (isPrime(i)) {
                countPrime++;
                sumPrime += i;
            }
        }

        // In kết quả
        System.out.println("Kết quả:");
        System.out.println("Số đối xứng: " + countPalindrome + ", Tổng: " + sumPalindrome);
        System.out.println("Số chính phương: " + countPerfectSquare + ", Tổng: " + sumPerfectSquare);
        System.out.println("Số nguyên tố: " + countPrime + ", Tổng: " + sumPrime);
    }
}
