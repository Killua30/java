import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Main {

    public static IntStream FibonacciStream(int sum) {

        IntSupplier generator = new IntSupplier() {
            int i=0;
            int summ =0;
            int flag=1;
            int[] myArray = new int[10];

            int next(int i) {
                if (i == 0 || i ==1){
                    summ++;
                    return 1;
                }
                int x=next(i-1) + next(i-2);
               summ +=x;
               if(summ >sum && flag==1){
                   flag=0;
               }
                return x;
            }

            public int getAsInt() {
                return next(i++);
            }

        };
        double phi = (1.0+sqrt(5.0))/2.0;
        int z=0;
        int mm=0;

        while(mm==0 ){
            if((pow((1.0+sqrt(5.0))/2.0,z+3)-pow((1.0-sqrt(5.0))/2.0,z+3))/sqrt(5)-1.0<=sum+0.0001)z++;
            else break;
        }

        IntStream natural = IntStream.generate(generator)
                .limit(z);

        return natural;

    }

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer){
       List<? extends T> sortedlist = stream.sorted(order).collect(Collectors.toList());
        if (sortedlist.size()!=0) {
            minMaxConsumer.accept(sortedlist.get(0), sortedlist.get(sortedlist.size()-1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }



    public static <T> void findMostFrequent(List<? extends T> list){
        int fr=0;
       int com=0;
        for(int i=0;i<list.size();i++){
            int q=0;
            for(int k=i;k<list.size();k++){
                if(list.get(k)==list.get(i))q++;
            }
            if (q>fr) {
                fr = q;
                com = i;
            }
        }
        System.out.println(list.get(com));
    }
    public static Map<Vector, Double> vectorsLengths(Collection<Vector> vectors){
        HashMap<Vector,Double> lengths = new HashMap<>();
        for (Vector vector:
             vectors) {
            lengths.put(vector,vector.length());
        }
        return lengths;
    }



    public static void main(String[] args) {
       IntStream fibonacciStream = FibonacciStream(15000000);
       fibonacciStream.forEach(System.out::println);
       // проверка,что сумма не превосходить заданную выполняется в самой программе
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(-50);
        list.add(4000);
        list.add(6);
        list.add(9);
        list.add(9);
        list.add(9);
        Stream<Integer> stream = list.stream();

        findMinMax(
                stream,
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println( x + " " +  y)
        );
        stream.close();

        findMostFrequent(
                list
        );

    Collection <Vector> vectors = new HashSet<>();
    vectors.add(new Vector(1,0,0));
    vectors.add(new Vector(0,2,0));
    vectors.add(new Vector(3,4,0));
        HashMap<Vector,Double> lengths = (HashMap<Vector, Double>) vectorsLengths(vectors);
        System.out.println(lengths);
    }
}


