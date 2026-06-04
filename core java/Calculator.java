import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "add":
                System.out.println(a + b);
                break;
            case "subtract":
                System.out.println(a - b);
                break;
            case "multiply":
                System.out.println(a * b);
                break;
            case "divide":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}