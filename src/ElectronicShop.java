import java.util.Arrays;

public class ElectronicShop {
    public static void main(String[] args) {

        System.out.println(getMoneySpent(new int[]{40,50,60},new int[]{5,8,12},60));

    }
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int maxSum = -1;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                if(keyboards[i] + drives[j] <= b){
                    int currSum = keyboards[i] + drives[j];
                    if(maxSum < currSum)
                        maxSum = currSum;
                }
            }
        }


        return maxSum;

    }
}
