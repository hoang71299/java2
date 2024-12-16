package ss5__loop.exercise;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 2 ;i <=(2 * n) ;i= i +2){

            System.out.println(i );
        }
    }
}
