import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            map.put(id, name);
        }
        int sid = sc.nextInt();
        if (map.containsKey(sid))
            System.out.println(map.get(sid));
        else
            System.out.println("ID not found");
    }
}