package ss3_java_overview.exercise;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem toan:  ");
        int diemToan = scanner.nextInt();
        System.out.print("Nhap he so diem toan :  ");
        int heSoToan = scanner.nextInt();
        System.out.print("Nhap dien ly:  ");
        int diemLy = scanner.nextInt();
        System.out.print("Nhap he so diem Ly :  ");
        int heSoLy = scanner.nextInt();
        System.out.print("Nhap diem hoa:  ");
        int diemHoa = scanner.nextInt();
        System.out.print("Nhap he so diem Hoa :  ");
        int heSoHoa = scanner.nextInt();
        double diemTB = (diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa) / (heSoToan + heSoLy + heSoHoa);
        System.out.print("Điểm trung bình là "+diemTB);
    }
}
