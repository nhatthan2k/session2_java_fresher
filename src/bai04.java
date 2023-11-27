import java.util.Scanner;

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("số đó chia hết cho 3 và 5");
        } else if (number % 3 == 0) {
            System.out.println("số đó chỉ chia hết cho 3");
        } else if (number % 5 == 0) {
            System.out.println("số đó chỉ chia hết cho 5");
        } else {
            System.out.println("Không chia hết cho 3 và 5");
        }
    }
}
