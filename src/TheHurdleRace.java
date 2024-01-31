import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(4, Arrays.asList(1, 6, 3, 5, 2)));
    }
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int maxNum = height.get(0);
        for(int i = 0; i < height.size(); i++){
            if(maxNum < height.get(i)){
                maxNum = height.get(i);
            }
        }
        if(k > maxNum)
            return 0;
        else return maxNum-k;

    }
}
