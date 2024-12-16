package ss4_condition.execrise;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngay .thang . nam :");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String date = scanner.nextLine();
       try {
           LocalDate date1 = LocalDate.parse(date, formatter);
           date1 = date1.plusDays(1);
           System.out.println("Ngày kế tiếp là :" + date1.format(formatter));
           LocalDate date2 = LocalDate.parse(date, formatter);
           date2 = date2.minusDays(1);
           System.out.println("Ngày trước đó là :" + date2.format(formatter));
       }catch (Exception e){
           System.out.println("nhập sai dữ liệu");
       }
    }

}
