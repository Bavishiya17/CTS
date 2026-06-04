public class PatternMatchingForSwitch {

    static void check(Object obj) {

        if (obj instanceof Integer) {
            System.out.println("Integer : " + obj);
        }
        else if (obj instanceof String) {
            System.out.println("String : " + obj);
        }
        else if (obj instanceof Double) {
            System.out.println("Double : " + obj);
        }
        else {
            System.out.println("Other Type");
        }
    }

    public static void main(String[] args) {
        check(10);
        check("CTS");
        check(25.5);
    }
}