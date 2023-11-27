import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số điện cũ: ");
        float powerNumberOld = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập số điện mới: ");
        float powerNumbernew = Float.parseFloat(scanner.nextLine());

        float powerNumber = powerNumbernew - powerNumberOld;
        float price;

        if (powerNumber>=0 && powerNumber<50 ) {
            price = powerNumber * 10000;
        } else if (powerNumber<100) {
            price = powerNumber * 15000;
        } else if (powerNumber<150) {
            price = powerNumber * 20000;
        } else if (powerNumber<200) {
            price = powerNumber * 25000;
        } else {
            price = powerNumber * 30000;
        }

        System.out.println("tiền điện cần nộp: " + price);
    }
}
