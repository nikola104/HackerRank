public class Anagram {
    public static void main(String[] args){
            int a = anagram("xaxbbbxx");
        System.out.println(a);

    //    fdhlvosf pafhalll
   //              fdhlvos
   //               1  234
    }
    public static int anagram(String s) {
        // Write your code here
        if(s.length() % 2 != 0){
            return -1;
        }
        String a = s.substring(0, s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        StringBuilder sb = new StringBuilder(b);

        int count = 0;
        int countSaver = 0;

        //     xaxb bbxx
        for(int i = 0; i < a.length(); i++){
            countSaver = 0;
            for(int j = 0; j < sb.length(); j++){
                if(a.charAt(i) == sb.charAt(j)){
                    countSaver++;
                    sb.setCharAt(j,'*');
                    break;
                }
            }
            if(countSaver == 0){
                count++;
            }
        }
        return count;
    }
}
