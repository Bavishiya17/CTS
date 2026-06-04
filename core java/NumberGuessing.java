import java.util.Scanner;

public class NumberGuessing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 100) + 1;
        int guess = sc.nextInt();
        while (guess != num) {
            if (guess > num)
                System.out.println("Too High");
            else
                System.out.println("Too Low");

            guess = sc.nextInt();
        }
        System.out.println("Correct");
    }
}
