import java.util.ArrayList;
import java.util.Scanner;

public class Chisla {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listElse = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            list.add(console.nextInt());
            if(list.get(i)%6==0){
                list2.add(list.get(i));
                list3.add(list.get(i));
            }
            else{
                if(list.get(i)%3==0) list3.add(list.get(i));
                else {
                    if(list.get(i)%2==0)list2.add(list.get(i));
                    else listElse.add(list.get(i));
                }
            }

        }
        printList(list3);
        printList(list2);
        printList(listElse);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i : list){
            System.out.println(i);
        }
    }

}
