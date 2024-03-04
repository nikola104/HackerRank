public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba",10));
    }
    public static long repeatedString(String s, long n) {
        // Write your code here

        long countOfAInS = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                countOfAInS++;
            }
        }

        long repeats = n / s.length();


        long remainingChars = n % s.length();
        long countOfAInRemainingChars = 0;
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                countOfAInRemainingChars++;
            }
        }

        long totalCountOfA = (repeats * countOfAInS) + countOfAInRemainingChars;

        return totalCountOfA;
    }

}
