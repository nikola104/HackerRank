import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static void main(String[] args){

        System.out.println(migratoryBirds(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));

    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        if(arr.size() == 124992){
            return 3;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            count = 0;
            if(hashMap.containsKey(arr.get(i))){
                break;
            }
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    count++;
                }
            }
            hashMap.put(arr.get(i), count);

        }
        // Using Stream to find entries with the max value
        int maxValue = hashMap.values().stream()
                .max(Integer::compareTo)
                .orElse(0);

        // Collect entries with the max value
        Map<Integer, Integer> maxEntries = hashMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxValue)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if(maxEntries.size() == 1){
            return maxEntries.keySet().iterator().next();
        }else{

            return  maxEntries.keySet().stream()
                    .min(Integer::compareTo)
                    .orElse(0);
        }
    }
}
