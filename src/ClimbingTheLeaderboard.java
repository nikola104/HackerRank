import java.util.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        List<Integer> a = climbingLeaderboard(Arrays.asList(100,90,90,80,75,60), Arrays.asList(50,65,77,90,102));
        System.out.println(a);


    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> ranking = new HashMap<>();
        int place = 1;

        for(int i = 0; i < ranked.size(); i++){
            if(!ranking.containsKey(ranked.get(i))){
                ranking.put(ranked.get(i), place++);
            }
        }

        int init = ranked.size()-1;
        for(int score : player){
            for(int i = init; i >= 0; i--){
                if(score >= ranked.get(i)){
                    place = ranking.get(ranked.get(i));
                    init = i-1;
                }
                else break;
            }
            result.add(place);
        }


        return result;
    }
}
