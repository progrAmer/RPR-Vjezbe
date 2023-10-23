import java.util.Scanner;

public class LV1Z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println(String.format("Numbers you've entered are: %d %d", x, y));
    }
}
