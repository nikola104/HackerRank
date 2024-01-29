import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {

        System.out.println(pickingNumbers(Arrays.asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4)));

    }
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        //  4 6 5 3 3 1

        //  1 3 3 4 5 6

        //  1 1 2 2 4 4 5 5 5

        Collections.sort(a);
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < a.size(); i++) {
            count = 0;
            for (int j = i+1; j < a.size(); j++) {
                int dif = Math.abs(a.get(i) - a.get(j));
                if (dif <= 1) {
                    count++;
                }
            }
            if (tempCount < count) {
                tempCount = count;
            }
        }

        return tempCount+1;

    }
}
