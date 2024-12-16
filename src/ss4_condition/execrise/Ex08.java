package ss4_condition.execrise;

import java.util.Calendar;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng :");
        int month = scanner.nextInt();
        System.out.println("Nhập số năm : ");
        int year = scanner.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR , year);
        c.set(Calendar.MONTH, month - 1 )   ;
        int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Tháng " + month + " cua năm " + year + " co " + dayInMonth + " ngày.");
    }

}
