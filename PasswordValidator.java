import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String password = scan.nextLine();
        if (charLength(password) && CheckForTwoLetters(password) && lettersAndDigitsCheck(password)){
        System.out.println("Password is valid");
    }
        if(!charLength(password) ){
        System.out.println("Password must be between 6 and 10 characters");
    }
        if(!lettersAndDigitsCheck(password)){
        System.out.println("Password must consist only of letters and digits");
    }
        if(!CheckForTwoLetters(password)){
        System.out.println("Password must have at least 2 digits");
    }
}

    private static boolean charLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean lettersAndDigitsCheck(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean IsLetter = Character.isLetter(symbol);
            boolean IsDigit = Character.isDigit(symbol);
            if (!IsDigit && !IsLetter){
                return false;
            }
        }
        return true;
    }
    private static boolean CheckForTwoLetters (String password){
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isDigit = Character.isDigit(symbol);

            if(isDigit){
                counter++;
            }
            if (counter>=2 ){
                return true;
            }
        }
        return false;
    }
}
