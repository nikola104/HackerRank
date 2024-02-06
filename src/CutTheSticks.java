import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(8);
        numbers.add(14);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(14);
        numbers.add(12);

        System.out.println(cutTheSticks(numbers));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> a = new ArrayList<>();
        a.add(arr.size());
        while(!arr.isEmpty()){
            int smallestNumber = arr.get(0);
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) < smallestNumber){
                    smallestNumber = arr.get(i);
                }
            }
            System.out.println(smallestNumber);
            System.out.println(arr.toString());
            for(int i =0 ; i < arr.size(); i++){
                arr.set(i, arr.get(i) - smallestNumber);
                if(arr.get(i) == 0){
                    arr.remove(i);
                    i--;
                }

            }
            a.add(arr.size());
        }

        a.remove(a.size()-1);
        return a;
    }

}
