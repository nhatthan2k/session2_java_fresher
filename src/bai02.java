import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("điểm trung bình của sinh viên: ");
        float avgMark = scanner.nextFloat();
        String Rate ;

        if (avgMark > 0 && avgMark < 5){
            Rate = "yếu";
        } else if (avgMark < 7) {
            Rate = "trung bình";
        } else if (avgMark < 8) {
            Rate = "khá";
        } else if (avgMark < 9) {
            Rate = "giỏi";
        } else {
            Rate = "xuất sắc";
        }

        System.out.printf("sinh viên xếp loại %s", Rate);
    }
}
