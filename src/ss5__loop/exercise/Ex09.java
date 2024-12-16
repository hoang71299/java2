package ss5__loop.exercise;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n ");
        int n =scanner.nextInt();
        int  a = 1;
        int d = 1;
        while (a <=n ){
            System.out.println(a * d);
            a = a * 2  + 1;
            d= -d;
        }
    }
}
