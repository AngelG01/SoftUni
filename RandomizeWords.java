import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] word = input.split("\\s+" );
        Random randomGenerator = new Random();

        for (int i = 0; i < word.length ; i++) {
            int x = randomGenerator.nextInt(word.length);
            int y = randomGenerator.nextInt(word.length);
            String oldWordsX = word[x];
            word[x] = word[y];
            word[y] = oldWordsX;

        }
        System.out.println(String.join("\n", word));

    }
}
