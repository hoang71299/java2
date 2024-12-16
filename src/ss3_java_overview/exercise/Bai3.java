package ss3_java_overview.exercise;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm :");
        String name = scanner.nextLine();

        System.out.print("Nhập só lượng");
        int amount = scanner.nextInt();

        System.out.print("Nhâp đơn giá ");
        double price = scanner.nextDouble();

        double total = (amount * price);
        System.out.println("Tiên = "+total);
        System.out.println("Thuế = "+ (total * 0.1));

    }
}
