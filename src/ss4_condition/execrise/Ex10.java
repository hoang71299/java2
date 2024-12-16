package ss4_condition.execrise;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập 1 số nguyên dương :");
        int n = scanner.nextInt();
        double squareRoot = Math.sqrt(n);
        if(squareRoot % 1 == 0){
            System.out.println(n + " la số chính phương");
        }else {
            System.out.println(n + " khong  phai số chính phương");
        }
    }
}
