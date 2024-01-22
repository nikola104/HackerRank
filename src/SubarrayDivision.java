import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {

        int a = birthday(Arrays.asList(2 ,5, 1, 3 ,4 ,4, 3 ,5 ,1, 1 ,2 ,1 ,4 ,1, 3 ,3 ,4, 2, 1),18,7);
        System.out.println(a);

    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        if(m > s.size()){
            return 0;
        }
        if(s.size() == 1 && s.get(0) == d){
            return 1;
        }

        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.size()-m+1; i++){
            list.clear();
            for(int j = i; j < m+i; j++){
                list.add(s.get(j));
            }
            int sum = 0;
            for(int l = 0; l < list.size(); l++){
                sum += list.get(l);
            }

            if(sum == d){
                count++;
            }
        }
        return count;


    }
}
