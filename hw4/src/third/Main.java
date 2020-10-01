package third;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int voltage = 220;
        Comp[] computers = new Comp[6];
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Documents\\GitHub\\java\\hw4\\src\\third\\param"));
        String [] splitted;
        splitted = sc.nextLine().split(",");
        computers[0]=new Laptop(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new  Keyboard(splitted[5]), new Monitor(splitted[6]));

        splitted = sc.nextLine().split(",");
        computers[1]=new Netbook(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new  Keyboard(splitted[5]), new Monitor(splitted[6]));

        splitted = sc.nextLine().split(",");
        computers[2]=new PC(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]);
        splitted = sc.nextLine().split(",");
        computers[3]= new Monoblock(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new Monitor(splitted[5]));
        splitted = sc.nextLine().split(",");
        computers[4]= new Nettop(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4]) ;
        splitted = sc.nextLine().split(",");
        computers[5]= new Server(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4]) ;
        for(Comp comp :computers){
            try {
                System.out.println(comp.turnOn(voltage));
            } catch (ComputerTurnOnException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(comp.connect(ConnectionStatus.OK));
            try {
                System.out.println(comp.turnOff());
            } catch (ComputerTurnOffException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
