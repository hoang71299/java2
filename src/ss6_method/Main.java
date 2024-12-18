package ss6_method;

public class Main {

    public static void main(String[] args) {
        int a = 2 , b = 3;
        tinhTong(a,b);

        int z = 5;
        int tong = tinhTong2(a,b);
        tong = tinhTong2(a,tong);

        System.out.println(tong);
    }
    public static void tinhTong(int a , int b){
        int c = a + b;
        System.out.println("Tong: "+c);
    }

    public static int tinhTong2(int a , int b){
        int c = a + b;
        return c;
    }
}
