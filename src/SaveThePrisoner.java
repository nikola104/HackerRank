import java.util.ArrayList;
import java.util.List;

public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(6,10,5));

        // 3(2),1(0),2(1),3(2),1(0),2(1),3(2)
        // 1,   2,   3,   4,   5,   6,   7

    }
    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        int warnedPrisoner = 0;
        int count = 0;

        for(int i = s-1; i < list.size(); i++){
            count++;

            if(count == m){
                warnedPrisoner = i;
                break;
            }
            if(i == list.size()-1){
                i = -1;
            }


        }
        return warnedPrisoner+1;
    }
}
