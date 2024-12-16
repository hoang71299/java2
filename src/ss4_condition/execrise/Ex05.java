package ss4_condition.execrise;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a :");
        double a = scanner.nextInt();
        System.out.print("Nhap so nguyen b :");
        double b = scanner.nextInt();
        double x ;
        if(a == 0) {
            if( b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            x = -b/a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
    }
}
