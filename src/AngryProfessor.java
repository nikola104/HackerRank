import java.util.Arrays;
import java.util.List;

public class AngryProfessor{
    public static void main(String[] args) {
        System.out.println(angryProfessor(3, Arrays.asList(-1,-3,4,2)));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) <= 0){
                count++;
            }
        }
        if(count >= k)
            return "NO";
        else
            return "YES";

    }
}

