package ss6_method.exercise;

public class Ex5 {
    public static void main(String[] args) {

        int n = 10;
        printsNElementsFibonacci(n);

    }
    private static void printsNElementsFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
