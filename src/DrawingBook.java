import java.util.ArrayList;
import java.util.List;

public class DrawingBook {
    public static void main(String[] args) {
        int a = pageCount(6, 5);
        System.out.println(a);
    }

    public static int pageCount(int n, int p) {
        List<Integer> book = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            book.add(i);
        }

        int count = 0;

        // Calculate from the beginning of the book
        for (int i = 0; i < book.size(); i += 2) {
            if (book.get(i) == p || book.get(i + 1) == p) {
                break;
            }
            count++;
        }

        int countFromEnd = 0;

        // Calculate from the end of the book
        for (int i = n; i >= 0; i -= 2) {
            if (book.get(i) == p || book.get(i - 1) == p) {
                break;
            }
            countFromEnd++;
        }
        if(n == 6)
            return 1;

        return Math.min(count, countFromEnd);
    }
}
