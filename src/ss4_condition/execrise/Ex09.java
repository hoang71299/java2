package ss4_condition.execrise;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một ký tự chữ cái: ");
        char character = scanner.next().charAt(0);

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            if (character >= 'a' && character <= 'z') {
                character -= 32;
            } else {
                character += 32;
            }

            System.out.println("Ký tự sau khi đã đổi: " + character);
        } else {
            System.out.println("Bạn đã nhập sai. Hãy nhập một ký tự chữ cái.");
        }
    }
}
