import java.util.*;
public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bavi");
        names.add("Akash");
        names.add("Anandhi");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}