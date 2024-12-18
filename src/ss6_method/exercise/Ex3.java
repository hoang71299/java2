package ss6_method.exercise;

public class Ex3 {
    public static void main(String[] args) {
        int n =10;
        System.out.println("Bài 1 "+tinhTong(n));
        System.out.println("Bài 2 "+tinhTong2(n));
        System.out.println("Bài 3 "+tinhTong3(n));
        System.out.println("Bài 4 "+tinhNhan(n));
        System.out.println("Bài 5 "+tinhTong4(n));

    }
    private  static double tinhTong(int n){
        double sum = 0 ;
        for (int i = 1; i <=n ; i++) {
            sum += i;

        }
        return sum;
    }

    private static  double tinhTong2 (int n){
        double sum = 0 ;
        for (int i = 1; i <=n ; i++) {
            sum+= Math.pow(i,2);
        }
        return sum;
    }

    private  static  double tinhTong3(int n){
        double sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += 1.0/i;
        }
        return sum;
    }
    private  static  double tinhNhan(int n){
        double sum = 1;
        for (int i = 1; i <=n ; i++) {
            sum *= i;
        }
        return sum;
    }
    private static int giaiThua(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    private  static double tinhTong4(int n){
        double sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += giaiThua(i);
        }
        return sum;
    }
}
