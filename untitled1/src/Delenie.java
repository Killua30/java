import java.io.*;

public class Delenie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        FileInputStream first = new FileInputStream(name1);
        FileOutputStream second = new FileOutputStream(name2);
        FileOutputStream third = new FileOutputStream(name3);

        int l2;

            if (first.available() % 2 == 0) {
                l2 = first.available() / 2;
            } else
                l2 = first.available() / 2 + 1;

            byte[] bufferForSecondFile = new byte[l2];
            byte[] bufferForThreadFile = new byte[first.available() / 2];

            second.write(bufferForSecondFile, 0, first.read(bufferForSecondFile));

            third.write(bufferForThreadFile, 0, first.read(bufferForThreadFile));

        reader.close();
        first.close();
        second.close();
        third.close();
    }
}
