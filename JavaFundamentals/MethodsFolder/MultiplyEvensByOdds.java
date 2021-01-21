import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(getSumOfEvenOrOddNumbers(a));

    }

    private static int getSumOfEvenOrOddNumbers(int a) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        String[] digits = new String[number.length()];

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < digits.length; i++) {
             a = Integer.parseInt(digits[i]);
            if (a % 2 == 0) {
                sumOfEven += a;
            } else {
                sumOfOdd += a;
            }
        }
        return a;
    }

}
