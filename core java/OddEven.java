import java.util.*;
public class OddEven{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number is Odd");
        }
    }
}