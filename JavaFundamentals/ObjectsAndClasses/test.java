import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String line = scan.nextLine();
        while(!line.equals("Stop")){

            names.add(line);
            String[] data = line.split("-");
            Guest guest = new Guest();
            guest.setName(data[1]);
            guest.setMeal(data[2]);
            line = scan.nextLine();
        }




        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
    static class Guest{
        String name;
        String meal;

        public String getName(String datum) {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMeal(String datum) {
            return meal;
        }

        public void setMeal(String meal) {
            this.meal = meal;
        }
    }

}
