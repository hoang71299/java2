package ss5__loop;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score;
        do {
            System.out.print("Nhap vao diem: ");
            score = scanner.nextInt();
            if(score < 0 || score > 10){
                System.out.print("Diem hong hop le, diem tu  [0,10],vui long nhap lai");
            }
        } while (score < 0 || score > 10);
        System.out.println("Diem: "+score);
    }
}
