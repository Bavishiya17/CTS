import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}