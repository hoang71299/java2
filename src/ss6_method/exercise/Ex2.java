package ss6_method.exercise;

public class Ex2 {
    public static void main(String[] args) {
        int n = 1239;
        System.out.println(daoSo(n));
        System.out.println(laSoDoiXung(n));
        System.out.println(soChinhPhuong(n));
        System.out.println("Tồng = "+tongSoChinhPhuong(n));
        System.out.println("Tồng so nguyen to "+tongSoNguyenTo(n));
        System.out.println("Tồng so le "+tongSoLe(n));
    }

    public static int daoSo(int n){
       int soDao = 0;
       while (n != 0){
           int donVi = n %10;
           soDao = soDao  * 10  + donVi;
           n = n / 10;
       }
       return  soDao;
    }
    private static boolean laSoDoiXung(int n){
        return daoSo(n) == n;

    }
    private static boolean soChinhPhuong(int n){
        return Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n));
    }
    private  static int tongSoChinhPhuong(int n){
        int result = 0;
       while(n > 0){
           int digit = n % 10;
           n = n/10;
           if(soChinhPhuong(digit)){
               result += digit;
           }
       }
       return result;
    }

    private static   boolean laSoNguyenTo(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    private static int tongSoNguyenTo(int n){
        int result = 0;
        while (n >0){
            int digit = n % 10;
            n = n / 10;
            if(laSoNguyenTo(digit)){
                result += digit;
            }
        }
        return result;
    }
    private static boolean soLe(int n){
        return n % 2 == 1;
    }
    private static int tongSoLe(int n){
        int result = 0;
        while (n >0){
            int digit = n % 10;
            n = n / 10;
            if(soLe(digit)){
                result += digit;
            }
        }
        return result;
    }


}
