import java.util.Arrays;
import java.util.List;

public class BetweenTwoSet {
    public static void main(String[] args) {

        int answer = getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96));
        System.out.println(answer);

    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;
        int min = a.get(a.size() - 1);
        int max = b.get(0);

        for(int i = min; i <= max; i++){
            boolean isFactor = true;

            for(int j = 0; j <= a.size()-1;j++){

                if(i % a.get(j) != 0){
                    isFactor = false;
                    break;
                }
            }
            if(isFactor){

                for(int t = 0; t <= b.size()-1;t++){
                    if(b.get(t) % i != 0){
                        isFactor = false;

                    }
                }
            }
            if(isFactor){
                count++;
            }


        }
        return count;




    }
}
