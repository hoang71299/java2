package ss3_java_overview.exercise;

import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        int banKinh = scanner.nextInt();
        double chuVi  = 2 * Math.PI * banKinh;
        double dienTich = Math.pow(banKinh, 2) * Math.PI;
        System.out.println("Chu Vi là : "+chuVi );
        System.out.println("Bán Kính là "+dienTich);
    }
}
