import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập tháng: ");
        int month = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập năm: ");
        int year = Integer.parseInt(scanner.nextLine());
        int day ;

        if (year<1 || month > 12 || month < 1) {
            System.out.println("ngày tháng năm không hợp lệ");
        }

        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2) {
            day = 29;
        } else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            day = 30;
        } else if (month == 2) {
            day = 28;
        } else {
            day = 31;
        }

        System.out.printf("tháng %d năm %d có %d ngày", month, year, day);
    }
}
