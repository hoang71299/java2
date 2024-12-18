package ss5__loop.exercise;

public class Ex16 {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1 ;i <= n ; i ++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh b");
        for (int i = 1; i <=n; i++) {
            for (int j = n ; j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hình c");
        for (int i = 1; i <=n ; i++) {
            for (int j = n ; j >= i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("hinh d");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i ; j--) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        System.out.println("hình f");
        for (int i = 1; i <=n ; i++) {
            for (int j = n ; j >= i ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 -1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
