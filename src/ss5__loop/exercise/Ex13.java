package ss5__loop.exercise;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();

        System.out.println("UCLN la "+ ucln(a,b));
        System.out.println("BCNN la "+ bcnn(a,b));
    }
    private  static  int  ucln(int a  , int b){
        while (a  != b){
            if (a > b){
                a = a - b;

            }else {
                b = b - a;
            }
        }
        return a;
    }
    private  static  int bcnn (int a , int b){
        return a * b / ucln(a , b);

    }
}
