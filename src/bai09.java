import java.util.Scanner;

public class bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số thứ nhất: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ nhất: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ nhất: ");
        int c = Integer.parseInt(scanner.nextLine());

        int one = a;
        int two ;
        int three;

        if (b < one) {
            two = b;

            if (c > one){
                one = c;
                two = a;
                three = b;
            } else {
                if (c>two) {
                    two =c;
                    three = b;
                }else {
                    three =c;
                }
            }
        } else {
            one = b;
            two = a;

            if (c > one) {
                one = c;
                two = b;
                three = a;
            } else {
                if (c > two) {
                    two = c;
                    three = a;
                } else {
                    three = c;
                }
            }
        }

        System.out.printf("thứ tự các chữ số là: %d %d %d", one, two, three );

    }
}
