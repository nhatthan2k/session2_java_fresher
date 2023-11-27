import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số nguyên: ");
;       int number = scanner.nextInt();

        if (number%2==0){
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
    }
}
