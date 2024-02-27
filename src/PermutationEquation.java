import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PermutationEquation {

    public static void main(String[] args) {

        System.out.println(permutationEquation(Arrays.asList(5,2,1,3,4)));

    }

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int y = 0;
        int count = 1;
        while(count != p.size()+1){
            for(int i = 0; i < p.size(); i++){
                if(p.get(i) == count){
                    y = i+1;
                    for(int t = 0; t < p.size(); t++){
                        if(p.get(t) == y){
                            list.add(t+1);
                            count++;
                        }
                    }
                }

            }
        }
        return list;

    }

}
