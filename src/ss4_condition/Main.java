package ss4_condition;

public class Main {
    public static void main(String[] args) {
        double score = 6;
        if(score >10 || score < 0){
            System.out.println("Diem khong hop le");
        }else if(score < 5){
            System.out.println("Yeu");
        }else if (score < 6.5){
            System.out.println("Trung binh");
        }else if(score < 8){
            System.out.println("Kha");
        }else {
            System.out.println("Gioi");
        }
    }
}
