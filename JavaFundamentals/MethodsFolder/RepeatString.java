import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeated = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        String repeat = repeatString(repeated,count);
        System.out.println(repeat);

    }
    private static String repeatString(String repeated , int count){
       String[] rep = new String[count];
        for (int i = 0; i < count; i++) {
            rep[i] = repeated;
        }
        String repeat = String.join(" ", rep);
       return repeat;
    }
}
