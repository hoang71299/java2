package ss5__loop.exercise;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n ");
        int n =scanner.nextInt();
        int  a = 1;
        while (a <=n ){
            System.out.println(a);
            a = a * 2  + 1;
        }

    }
}
