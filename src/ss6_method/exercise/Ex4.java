package ss6_method.exercise;

public class Ex4 {
    public static void main(String[] args) {
        int a = 2 , b = 3;
        System.out.println(ucln(a,b));
        System.out.println(bcnn(a,b));
    }
    private static  double ucln (int a , int b){
        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }
    private static  double bcnn (int a , int b){
        return a * b / ucln(a , b);
    }
}
