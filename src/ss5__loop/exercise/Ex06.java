package ss5__loop.exercise;

public class Ex06 {
    public static void main(String[] args) {
        int n =20;
        int count = 0;
        int khoangcach = 1;
        for (int i = 2; i<= n ;  i++){
            if(count == khoangcach){
                System.out.print(-i + "\t");
                count = 0;
                khoangcach++;
            }
            else{
                System.out.print(i + "\t");
                count ++;
            }
        }
    }
}
