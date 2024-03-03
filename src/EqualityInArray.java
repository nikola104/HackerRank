import java.util.Arrays;
import java.util.List;

public class EqualityInArray {
    public static void main(String[] args) {

        System.out.println(equalizeArray(Arrays.asList(3, 3 ,2 ,1 ,3)));

    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int count = 0;
        int valueToKeep = 0;
        int oldCount = 0;
        for(int i = 0; i < arr.size(); i++){
            count = 0;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j)){
                    count++;
                }
            }
            if(count > oldCount){
                oldCount = count;
                valueToKeep = arr.get(i);
            }

        }
        count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) != valueToKeep){
                count++;
            }
        }
        return count;

    }
}
