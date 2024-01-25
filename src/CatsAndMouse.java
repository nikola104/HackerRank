public class CatsAndMouse {
    public static void main(String[] args) {
            String a = catAndMouse(2,5,4);
        System.out.println(a);

    }
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(z-y) == Math.abs(z-x)){
            return "Mouse C";
        }
        if(Math.abs(z-y) > Math.abs(z-x)){
            return "Cat A";
        }
        return "Cat B";

    }

}
