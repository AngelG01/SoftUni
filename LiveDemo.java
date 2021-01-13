import org.ietf.jgss.GSSContext;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiveDemo {
    static class Circle {
        double radius;

        Circle (double radius){
        this.radius = radius;
        }

        double getArea() {
            return radius * radius * Math.PI;
        }

        void scale (double format){
            radius*= format;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Circle c = new Circle(5);

        c.scale(2);
        System.out.println(c.getArea());

        Circle c2 = new Circle(10);
        c2.scale(3);
        System.out.println(c2.getArea());

    }
}

/*
        Scanner scan = new Scanner(System.in);
        List<String> reservatinHolders = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] namesAndPlaces = input.split(" ");

            reservatinHolders.add(namesAndPlaces[0]);
            count.add(Integer.parseInt(namesAndPlaces[1]));
            input = scan.nextLine();
        }
        String name = scan.nextLine();
        int resIndex = -1;
        for (int i = 0; i < reservatinHolders.size(); i++) {
            if (name.equals(reservatinHolders.get(i))) {
                resIndex = i;
            }
        }
        if (resIndex != -1){
            System.out.println(count.get(resIndex));
        }else {
            System.out.println("Sorry no reservations for " + name);
        }*/