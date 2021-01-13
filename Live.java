import java.util.*;

public class Live {
    public static void main(String[] args) {
        List<String> cityName = new ArrayList<>();
        cityName.add("Gabrovo");

        Map<String, Integer > infectedByCity = new HashMap<>();
        infectedByCity.put("Gabrovo", 12);
        infectedByCity.put("Gabrovo", 132);

        System.out.println(infectedByCity.get("Gabrovo"));

    }
}
