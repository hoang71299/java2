package ss4_condition.execrise;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tham nien cong tac ");
        int n = scanner.nextInt();
        double hesoLuongCoBan = 650000.0;
        double hesoLuong;
        if(n < 12 ){
            hesoLuong = 1.92d;
        }else if( n <36){
            hesoLuong = 2.34d;
        }else if(n < 60) {
            hesoLuong = 3d;
        }else{
            hesoLuong = 4.5d;
        }
        double luong = hesoLuong * hesoLuongCoBan;
        System.out.println("Luong cua nhan vien la " + luong);
    }
}
