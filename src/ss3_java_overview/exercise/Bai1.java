package ss3_java_overview.exercise;

import java.time.Year;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm sinh: ");
        int year = scanner.nextInt();

        System.out.println("Tuổi của bạn "+(Year.now().getValue() - year));

        //how to get current year  in jav
        System.out.println();
        
    }
}
