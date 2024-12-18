
package ss6_method.exercise;

import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello World";

        System.out.println("Câu a "+str.substring(6));
        System.out.println("Câu b "+str.replace('o','f'));

        int count = 0;
        for (int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'l'){
                count ++;
            }
        }
        System.out.println("câu c "+count);
        System.out.println("câu d  vi tri bat đầu "+str.indexOf('l') + " vi tri ket thuc "+str.lastIndexOf('l'));

        System.out.println("cau e "+str.replace(" ",""));
        System.out.println("cau f "+str.trim());
        StringBuilder daoChuoi = new StringBuilder();
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            daoChuoi.append(str.charAt(i));
        }
        System.out.println("cau g "+daoChuoi);
        String str2 = "SQC ";
        System.out.println("cau h "+str2.concat(str));
        System.out.println("cau i "+str.toUpperCase());
        System.out.println("cau j "+str.toLowerCase());
        System.out.println("nhap n");
        int n = scanner.nextInt();
        System.out.println("nhap m ");
        int m = scanner.nextInt();
        System.out.println("cau k "+str.substring(n,m));
    }
}
