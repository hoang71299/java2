package ss5__loop.exercise;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so n ");
        int n = scanner.nextInt();
        for (int i = 2; i <=n ; i = i + 2) {
            if(i % 4 == 0){
                System.out.print(-i + "\t");
            }else{
                System.out.print(i + "\t");
            }
            
        }
    }
}
