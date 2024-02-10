import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SameWords {
    public static void main(String[] args) {
        System.out.println(sameWords("Banana"));
    }

    private static Map<Character, Integer> sameWords(String str) {

        Map<Character, Integer> words = new HashMap<>();
        for(char i = 97; i <= 122; i++){
            words.put(i,0);
        }
        for(int i = 0; i < str.length(); i++){
            for(Character key : words.keySet()){
                if(str.charAt(i) == key){
                    words.put(key, words.get(key)+1);
                }
            }
        }

        words = words.entrySet().stream()
                .filter(entry -> entry.getValue() != 0 && entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        return words;

    }

}
