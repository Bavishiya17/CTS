import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.github.com");

            URLConnection connection = url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}