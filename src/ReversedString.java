public class ReversedString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    private static String reverseString(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
