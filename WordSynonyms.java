import java.lang.reflect.Array;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();

        String newSynonym = "adorable";
        List<String> cuteSynonyms = wordSynonyms.get("cute");
        if(cuteSynonyms == null){
            cuteSynonyms = new ArrayList<>();

        }
        cuteSynonyms.add(newSynonym);
        wordSynonyms.put("cute", cuteSynonyms );

        newSynonym = "charming";
         cuteSynonyms = wordSynonyms.get("cute");
        if(cuteSynonyms == null){
            cuteSynonyms = new ArrayList<>();

        }
        cuteSynonyms.add(newSynonym);
        wordSynonyms.put("cute", cuteSynonyms );


        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()){
            System.out.printf("%s -> %s,", entry.getKey(), entry.getValue());
        }
    }
}
