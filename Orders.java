import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int price = 0;
        switch (product) {
            case "coffee":
                coffee(quantity, price);
                break;
            case "water":
                water(quantity, price);
                break;
            case "coke":
                coke(quantity, price);
                break;
            case "snacks":
                snacks(quantity, price);
                break;

        }
    }

    private static void coffee(int quantity, double price) {
        price = 1.5;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);

    }

    private static void water(int quantity, double price) {
        price = 1.00;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);

    }

    private static void coke(int quantity, double price) {
        price = 1.40;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);

    }

    private static void snacks(int quantity, double price) {
        price = 2.00;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);

    }
}

