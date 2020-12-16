import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class third {

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader(console.nextLine()));
        ArrayList<String> list = new ArrayList<>();
        String s = reader.readLine();

        while (s!=null) {
            String[] c = s.split(" ");
            for (int i = 0; i < c.length; i++) {

                if (isInt(c[i]) == true) {
                    list.add(c[i]);
                }
            }
            s = reader.readLine();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(console.nextLine()));

        for (int x = 0; x < list.size(); x++) {
            if (x == list.size() - 1) {
                writer.write(list.get(x));
            } else {
                writer.write(list.get(x));
                writer.write(' ');
            }

        }
        reader.close();
        writer.close();
        console.close();

    }

}
