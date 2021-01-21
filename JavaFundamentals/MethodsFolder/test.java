import java.util.Scanner;

public class test {
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


       /* Scanner scan = new Scanner(System.in);
        char firstChar = scan.nextLine().charAt(0);
        char secondChar = scan.nextLine().charAt(0);
        printCharactersInRange(firstChar, secondChar);

    }

    public static void printCharactersInRange(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (char i = (char) (firstChar + 1); i < secondChar; i++) {
                System.out.print(i + " ");

            }
        } else {
            for (char i = (char) (secondChar + 1); i < firstChar; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
        /*for (int i = 0; i < b.length; i++) {
            int a = Integer.parseInt(digits[i]);
            if (a % 2 == 0) {
                sumOfEven += a;
            } else {
                sumOfOdd += a;
            }*/


//        for (int i = numb-1; i > 0 ; i--) {
//       for (int j = 1; j < i + 1; j++) {
//                System.out.print(j + " ");
//
//            }
//            System.out.println();
/*for (int i = numb-1; i > 0 ; i--){
            for (int j = i; j > 0 ; j--) {
                System.out.print(j + " ");
                if (j == 0) {
                    break;
                }
            }
            System.out.println();
        }
    */
/*
int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(getSmallestInt(a, b, c));

    }

    private static int getSmallestInt(int a, int b, int c) {
        int smallest = 0;
        if (a <= b && a <= c) {
            smallest = a;
        }
        if (b <= a && b <= c) {
            smallest = b;
        }
        if (c <= b && c <= a) {
            smallest = c;
        }
        return smallest;
    }
    */