package ss5__loop.exercise;

public class Ex19 {
    public static void main(String[] args) {
        int n = 112345236;
        String binary = "";
        while (n > 0){
            binary = n % 2 + binary;
            n = n / 2;
        }
        System.out.println(binary);


    }
}
