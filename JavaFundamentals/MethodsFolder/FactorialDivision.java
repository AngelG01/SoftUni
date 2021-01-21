import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        double result = factorialCalculation(a)*1.0 / factorialCalculation(b);
        System.out.printf("%.2f", result);
    }
    private static long factorialCalculation(int a){
        long totalFact = 1;
        for (int i = a; i > 0; i--) {
            totalFact*= i;
        }
       return totalFact;
    }
}
