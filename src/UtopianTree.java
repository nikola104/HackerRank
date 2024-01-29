public class UtopianTree {
    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }
    public static int utopianTree(int n) {
        // Write your code here
        if(n == 0){
            return 1;
        }
        int count = 0;

        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                count += count;
            }
            else count ++;
        }
        return count;
    }
}
