import java.io.*;
import java.util.Scanner;

public class MyFileOutputStream extends FileOutputStream {
    private boolean isActive = true;
    public MyFileOutputStream(String fileName) throws FileNotFoundException {
        super(fileName);
    }
    @Override
    public void close() throws IOException {
        Scanner console = new Scanner(System.in);
       if(isActive==true){
           System.out.println("Вы действительно хотите закрыть поток? Д/Н");
           String answer = console.nextLine();
           while(!answer.equals("Н") && !answer.equals("Д")){
               System.out.println("Неправильный ввод,повторите попытку.");
               answer = console.nextLine();
           }
           if (answer.equals("Д")) {
               super.close();
               console.close();
               isActive = false;
           }
       }
    }

}