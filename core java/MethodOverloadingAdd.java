public class MethodOverloadingAdd {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        MethodOverloadingAdd obj = new MethodOverloadingAdd();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5, 20.5));
        System.out.println(obj.add(10, 20, 30));
    }
}