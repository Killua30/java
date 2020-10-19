import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class zad3 {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> Set = new HashSet<>();
        for(T a : set1){
            if(set2.contains(a)==false){
                Set.add(a);
            }
    }
        for(T a : set2){
            if(set1.contains(a)==false){
                Set.add(a);
            }
        }
        return Set;


}



}

