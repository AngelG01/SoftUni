import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class live {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = Integer.parseInt(scan.nextLine());
        while ( number != 0){
            numbers.add(number);
            number = Integer.parseInt(scan.nextLine());
        }
        for (int i = numbers.size() - 1 ; i >= 0 ; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        }
    }

