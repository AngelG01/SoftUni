import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        math(number,power);
    }

    private static void math(double number, int power) {
        double total = 1;
        for (int i = 0; i < power; i++) {
        total *= number;
        }
        System.out.println(total);
    }
}
