import java.util.*;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static void main(String[] args) {
        int a = sockMerchant(9,Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        System.out.println(a);
    }
        //10 10 10 10 20 20 20 30 50

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        ar.sort(Comparator.naturalOrder());
        int maxNumb = ar.get(n-1);
        //System.out.println(maxNumb);
        int arr[] = new int[maxNumb+1];
        for(int num : ar){
            arr[num]++;
        }

        System.out.println(Arrays.toString(arr));

        int flag = 0;
        for(int i : arr){
            if(i%2==0) {
                flag += i / 2;
            }else{
                int math = i/2;
                if(math%2==0 || math == 1){
                    flag+=math;
                }
            }

        }
        return flag;
    }
}
