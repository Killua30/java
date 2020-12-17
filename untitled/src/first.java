import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(console.nextLine());

        int c = 0;
        while (fis.available() > 0){
            char q = (char) fis.read();
            if((q>=65 && q<=90) || (q>=97 && q<=122)) c++;
        }
        System.out.println(c);
    }
}

