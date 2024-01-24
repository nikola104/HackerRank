import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        List<Integer> a = climbingLeaderboard(Arrays.asList(100,90,90,80,75,60), Arrays.asList(50,65,77,90,102));
        System.out.println(a);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(4,5);
        System.out.println(b);


    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        int place = 1;
        int index = 0;

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < player.size(); i++){

            for(int j = 0; j < ranked.size()-1; j++){
                if(player.get(i) < ranked.get(i)){
                    if(ranked.get(i) == ranked.get(i+1)){
                        index++;
                        continue;
                    }else{
                        index++;
                    }
                    place++;
                }
            }
            ranked.add(index, player.get(i));
            result.add(place);

        }

return null;

    }
}
