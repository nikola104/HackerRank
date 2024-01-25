public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(12,"DUDDDUUDUU"));

    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level = 0;
        int hills = 0;

        boolean flag = false;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U')
                level++;
            if(path.charAt(i) == 'D')
                level--;
            if(level <= -1){
                flag = true;
            }
            if(level == 0 && flag){
                hills++;
                flag = false;
            }
        }

        return hills;

    }
}
