import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        Computer[] mas = new Computer[6];
        mas[0] = new Laptop();
        mas[1]= new Netbook();
        mas[2]= new PC();
        mas[3]=  new Nettop();
        mas[4]=  new Monoblock();
        mas[5]=  new Server();
        for(int i=0;i<=5;i++){
            mas[i].maker = "Dell";
            mas[i].model = "A3549B";
            mas[i].proc = "intel i5";
            mas[i].disk= "SSD 250GB";
            mas[i].ozu="8GB DDR4";
        }
        mas[0].maker = "Asus";
        mas[0].model = "TUF GAMING";
        mas[0].proc = "intel i7";
        mas[0].disk= "HDD 1TB";
        mas[0].ozu="16GB DDR4";
        mas[0].setMonitor("1920x1080","black");
        mas[0].setKeyboard("gamer","red");
        mas[1].setMonitor("1920x1080","gray");
        mas[1].setKeyboard("","black");
        mas[2].setVideo("GIGABYTE GeForce GTX 1050 Ti");
        mas[4].setMonitor("2048x1152","white");
        ExportVisitor exportVisitor = new ExportVisitor();
       FileWriter[] fwmas = new FileWriter[6];
        for(int i=0;i<=5;i++){
           File f = new File("C:\\Users\\ASUS\\Documents\\GitHub\\java\\untitled1\\src\\files\\" + mas[i].getClass() + ".txt");
            fwmas[i] = new FileWriter("C:\\Users\\ASUS\\Documents\\GitHub\\java\\untitled1\\src\\files\\" + mas[i].getClass() + ".txt");
            fwmas[i].write(exportVisitor.export(mas[i]));
            fwmas[i].flush();
            fwmas[i].close();
        }




    }

}
