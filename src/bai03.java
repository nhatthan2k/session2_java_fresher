import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số nguyên thứ nhất: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số nguyên thứ hai: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập phép toán (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("phép toán không hợp lệ");
        }

        System.out.println("kết quả: " + result);
    }
}
