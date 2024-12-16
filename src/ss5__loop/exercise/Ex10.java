package ss5__loop.exercise;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n :");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1 ; i<=n ; i++ ){
            sum = sum + 1.0/i ;
        }
        System.out.println("tổng là "+sum);
    }
}
