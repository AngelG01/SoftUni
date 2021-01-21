import java.net.SocketOption;
import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(middleOfText(text));
    }

    private static String middleOfText(String text) {
        String midSymbol = "";
        int length;
        int position;
        if (text.length() % 2 == 1) {
            position = text.length() / 2;
            length = 1;
        }else{
            position = text.length()/2-1;
            length = 2;
        }
        midSymbol = text.substring(position, position+length);
        return midSymbol;
    }
}
