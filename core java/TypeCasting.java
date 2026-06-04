public class TypeCasting {
    public static void main(String[] args) {
        double d = 10.75;
        int i = (int) d;
        int n = 20;
        double d2 = (double) n;
        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + i);
        System.out.println("Integer value: " + n);
        System.out.println("After casting to double: " + d2);
    }
}