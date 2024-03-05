public class GamesSalle {
    public static void main(String[] args) {
        System.out.println(howManyGames(84 ,35 ,51 ,9525));
    }
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        while(s != 0){
            if(p <= m){
                p = m;
            }
            if(s > p){
                break;
            }
            s -= p;
            p -= d;
            count++;
        }
        return count;

    }
}
