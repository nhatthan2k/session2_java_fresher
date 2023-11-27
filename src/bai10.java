import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập lương cớ bản: ");
        int basicSalari = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số ngày công: ");
        int workday = Integer.parseInt(scanner.nextLine());

        int salari = basicSalari * (workday / 26);

        if (workday > 26) {
            salari += (workday - 26)*basicSalari*150/2600;
        }

        System.out.println("lương của nhân viên: " + salari);
    }
}
