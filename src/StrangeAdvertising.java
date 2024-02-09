public class StrangeAdvertising {
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));

    }
    public static int viralAdvertising(int n) {
        // Write your code here
        int likes = 0;
        int people = 5;
        for(int i = 1; i <= n; i++){
            likes += people/2;
            people = (people/2)*3;

        }
        return likes;

    }
}
