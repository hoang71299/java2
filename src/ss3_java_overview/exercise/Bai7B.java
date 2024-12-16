package ss3_java_overview.exercise;

public class Bai7B {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + ++j; // i = 2, j = 2
        // a = 1 + 2 = 3
        System.out.println("i = " + i); // i = 2
        System.out.println("j = " + j); // j = 2
        System.out.println("a = " + a); // a = 3
    }
}
