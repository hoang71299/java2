package ss6_method.exercise;

import java.util.Scanner;

public class Ex6 {
    static  String hoTen;
    static  int tuoi;
    static  String gioiTinh;
    static  double mucLuong;
    static  double diemTrungBinh;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }
    public static void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap muc luong: ");
        mucLuong = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap diem trung binh: ");
        diemTrungBinh = Double.parseDouble(scanner.nextLine());
    }
    public static void xuatThongTin(){
        System.out.println("Ho ten: "+hoTen+" tuoi: "+tuoi+" gioi tinh: "+gioiTinh+" muc luong: "+mucLuong+" diem trung binh: "+diemTrungBinh);
    }
}
