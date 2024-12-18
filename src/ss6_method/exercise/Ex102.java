package ss6_method.exercise;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = scanner.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("Hai chuỗi a và b giống nhau.");
        } else if (result < 0) {
            System.out.println("Chuỗi a nhỏ hơn chuỗi b.");
        } else {
            System.out.println("Chuỗi a lớn hơn chuỗi b.");
        }
    }
}
