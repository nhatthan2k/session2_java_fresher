import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập ngày: ");
        int day = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập tháng: ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập năm: ");
        int year = Integer.parseInt(scanner.nextLine());

        boolean isvaild;

        if (year < 1 || month < 1 || month > 12 || day < 0 || day > 31) {
            isvaild = false;
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30 ){
            isvaild = false;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                isvaild = (day<=29);
            } else {
                isvaild = (day<=28);
            }
        } else {
            isvaild = true;
        }

        if (isvaild) {
            System.out.println("ngày tháng năm hợp lệ");
        } else {
            System.out.println("ngày tháng năm không hợp lệ");
        }

    }
}
