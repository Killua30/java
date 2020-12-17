import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class rarebites {
    public static void main(String[] args) throws IOException {
        int[] b = new int[260] ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        while (file.available()>0)
        {
            int q = file.read();
            b[q]++;
        }
        int ans =0;
        for(int i=0;i<257;i++)
        {
            if(b[i]>ans)ans=b[i];
        }
        for(int i=0;i<257;i++)
        {
            if(b[i]==ans) System.out.print(i + " ");
        }
        file.close();

    }
}
