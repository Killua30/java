import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    //2 задание
    public static <T, R> Function<T, R> ternaryOperator(
            Predicate<? super T> condition,
            Function<T, R> ifTrue,
            Function<T, R> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Computer> computers = new ArrayList<>();
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Documents\\GitHub\\java\\hw2\\src\\param"));
        String [] splitted;
        splitted = sc.nextLine().split(",");
        computers.add(new Laptop(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new  Keyboard(splitted[5]), new Monitor(splitted[6])));

        splitted = sc.nextLine().split(",");
        computers.add(new Netbook(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new  Keyboard(splitted[5]), new Monitor(splitted[6])));

        splitted = sc.nextLine().split(",");
        computers.add(new PC(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4],splitted[5]));
        splitted = sc.nextLine().split(",");
        computers.add(new Monoblock(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4], new Monitor(splitted[5])));
        splitted = sc.nextLine().split(",");
        computers.add(new Nettop(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4]) );
        splitted = sc.nextLine().split(",");
        computers.add(new Server(splitted[0],splitted[1],splitted[2],splitted[3],splitted[4])) ;
        Collections.sort(computers);
        for(Comp comp :computers){
            System.out.println(comp.turnOn());

        }

    }
}
