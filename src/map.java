import java.util.HashMap;
import java.util.Map;

public class map {

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Спицын", "Владимир");
        map.put("Быков","Владимир");
        map.put("Зарубин", "Дмитрий");
        map.put("Степа", "Лучший");
        map.put("Родионов", "Павел");
        map.put("Хромов", "Дмитрий");
        map.put("Журавлев", "Валерий");
        map.put("Аитова", "Алерия");
        map.put("Томашук", "Татьяна");
        map.put("Вселовес", "Ипатапи");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy1 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> entry : copy1.entrySet()) {
            removeItemFromMapByValue(map, entry.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<String, String>(map);
        int i=0;
        for (Map.Entry<String, String> entry: copy.entrySet())
        {
            if (entry.getValue().equals(value))
                i++;
        }
        if (i>1)
        {
            for (Map.Entry<String, String> entry2: copy.entrySet())
            {
                if (entry2.getValue().equals(value))
                    map.remove(entry2.getKey());
            }
        }
    }

    public static void printMap(Map<String,String> map){
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }

}
