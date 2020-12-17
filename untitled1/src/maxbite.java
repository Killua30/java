import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class maxbite {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int i = file.read();
        while (file.available()>0)
        {
            int q = file.read();
            if (q>i)
            {
                i = q;
            }

        }
        file.close();
        System.out.println(i);
    }
}