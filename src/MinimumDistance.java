import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumDistance {
    public static void main(String[] args) {
        System.out.println(minimumDistances(Arrays.asList(3,2,1,2,3)));
    }
    public static int minimumDistances(List<Integer> a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            for(int j = i+1; j < a.size(); j++){
                if(a.get(i).equals(a.get(j))){
                    int currMin = Math.abs(i-j);
                    list.add(currMin);
                }
            }
        }
        Collections.sort(list);

        if(list.isEmpty())
            return -1;
        else return list.get(0);

    }

}


