public class FindDigits {
    public static void main(String[] args) {

        System.out.println(findDigits(1012));
    }
    public static int findDigits(int n) {
        // Write your code here
        // 1 0 1 2
        int leftNum = n;
        int count = 0;
        while(leftNum != 0){
            int currNum = leftNum%10;
            leftNum = leftNum/10;
            if(currNum == 0){
                continue;
            }
            if(n%currNum == 0){
                count++;
            }

        }

        return count;

    }
}
