import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "";
       while(!a.equals("END")){
           String ab = scan.nextLine();
           a = ab;
           if (a.equals("END")){
               break;
           }else {
               System.out.println(palindromeInt(ab));
           }

        }

    }

    private static boolean palindromeInt(String a) {
        String rev = "";
        char[] reversedString = a.toCharArray();
        for (int i = reversedString.length - 1; i >= 0; i--) {
            rev += reversedString[i];
        }
        if (a.equals(rev)){
            return true;
        }
        return false;
    }
}
