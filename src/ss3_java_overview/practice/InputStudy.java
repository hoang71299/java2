package ss3_java_overview.practice;

import java.util.Scanner;

public class InputStudy {

    public static void main(String[] args) {
        int a = 2;

        //System.in : Tiêu chuẩn để nhập dữ liệu từ bản phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn : ");
        String name = scanner.nextLine();
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.println("Tên : "+name);
        System.out.println("Tuổi : "+age);

    }
}
