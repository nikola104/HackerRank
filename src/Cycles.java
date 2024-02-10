import java.util.Arrays;
import java.util.List;

public class Cycles {
    public static void main(String[] args) {
        System.out.println(forCycle(Arrays.asList(1,2,4,5,6,7,8,9,10)));
        System.out.println(whileCycle(Arrays.asList(1,2,4,5,6,7,8,9,10)));
    }

    private static List<Integer> whileCycle(List<Integer> list) {
        int i = list.size();
        int currVal = 0;
        while(i != 0){
            list.set(currVal,list.get(currVal)+1);
            currVal++;
            i--;
        }
        return list;
    }

    private static List<Integer> forCycle(List<Integer> list) {
      for(int i = 0; i < list.size(); i++){
          list.set(i,list.get(i)+1);
      }
      return list;
    }
}
