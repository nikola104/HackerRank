import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {
    public static void main(String[] args) {

        List<Integer> list = matchingStrings(Arrays.asList("aba","baba","aba","xzxb"), Arrays.asList("aba","xzxb","ab"));
        System.out.println(list);

    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        return queries.stream()
                .map(query -> (int) stringList.stream().filter(query::equals).count())
                .collect(Collectors.toList());


    }
}
