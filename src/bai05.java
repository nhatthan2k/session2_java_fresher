import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập cạnh thứ nhất: ");
        float a = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập cạnh thứ hai: ");
        float b = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập cạnh thứ ba: ");
        float c = Float.parseFloat(scanner.nextLine());

        String triangle;

        if (a == b && a == c) {
            triangle = "đều";
        } else if (a==b || a==c || b==c) {
            if (a*a == b*b + c*c || b*b==a*a+c*c || c*c == a*a + b*b) {
                triangle = "vuông cân";
            }
            triangle = "cân";
        } else if (a*a == b*b + c*c || b*b==a*a+c*c || c*c == a*a + b*b) {
            triangle = "vuông";
        } else {
            triangle = "thường";
        }

        System.out.printf("tam giác trên là tam giác %S", triangle);
    }
}
