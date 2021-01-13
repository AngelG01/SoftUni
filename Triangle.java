import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb = Integer.parseInt(scan.nextLine());
        trianglePlus(numb);
        triangleMinus(numb);
    }

    static void trianglePlus(int numb) {
        for (int i = 1; i < numb + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

    static void triangleMinus(int numb) {
        for (int i = numb-1; i > 0 ; i--) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

    }
}