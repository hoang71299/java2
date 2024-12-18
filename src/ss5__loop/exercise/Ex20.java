package ss5__loop.exercise;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a , b ,c ;

        do{
            System.out.println("Nhap so a :");
            a = scanner.nextInt();
            if(a <= 0){
                System.out.println("Nhap lai a :");
            }
        }while (a <= 0);

        do{
            System.out.println("Nhap so b :");
            b = scanner.nextInt();
            if(b <= 0){
                System.out.println("Nhap lai b :");
            }
        }while (b <= 0);
        do{
            System.out.println("Nhap so c :");
            c = scanner.nextInt();
            if(c <= 0){
                System.out.println("Nhap lai c :");
            }
        }while (c <= 0);

        System.out.println("a! + b! + c! = " + (factorial(a) + factorial(b) + factorial(c)));

    }

    private static  int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
