public class BeautifulDays {
    public static void main(String[] args) {
        System.out.println(beautifulDays(49860 ,205494 ,155635764));

    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count = 0;
        for(int y = i; y <= j; y++){
            int fNum = y;
            String str = String.valueOf(fNum);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            String s = sb.toString();

            while(s.startsWith("0")){
                s = s.substring(1,s.length());
            }

            int sNum = Integer.valueOf(s);
            double res = Math.abs(((double)fNum-(double)sNum)/k);

            if(res == (int)res)
                count++;


        }
        return count;

    }
}
