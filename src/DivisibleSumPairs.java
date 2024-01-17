import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args){

        System.out.println(divisibleSumPairs(6,3, Arrays.asList(1,3,2,6,1,2)));


    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;

        for(int i = 0; i < ar.size(); i++){
            for(int j = i+1; j < ar.size(); j++){
                if((ar.get(i) + ar.get(j)) % k == 0){
                    count++;
                }
            }
        }
        return count;


    }
}
