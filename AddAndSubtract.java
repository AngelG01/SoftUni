import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        System.out.println(Sum(a, b) - Subtract(c));
    }
     public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Subtract(int c) {
       return c;
    }
}

