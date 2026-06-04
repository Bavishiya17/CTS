import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0, right = str.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a >= 'A' && a <= 'Z')
                a = (char)(a + 32);
            if (b >= 'A' && b <= 'Z')
                b = (char)(b + 32);
            if (a != b) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}