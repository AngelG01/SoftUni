
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Map<Double, Integer> numberOccurences = new TreeMap<>();
        Scanner scan = new Scanner(System.in);

        String[] numbersAsString = scan.nextLine().split(" ");
        for (int i = 0; i < numbersAsString.length; i++) {
            double number = Double.parseDouble(numbersAsString[i]);

            Integer occurences = numberOccurences.get(number);
            if (occurences == null) {
                occurences = 0;

            }
            numberOccurences.put(number, occurences + 1);
        }
        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n" ,df.format(entry.getKey()), entry.getValue());
        }
    }
}
