import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); //можно Hashmap
        map1.put(5, "Rome");
        map1.put(8, "Moscow");
        map1.put(6, "NewYork");
       //map1.put(6, "Dubai"); //перезапишет, не выдаст ошибку!
        //map1.putIfAbsent(4, "Lion"); //добавит если нет в ключе 6 нет значения
        //System.out.println(map1.entrySet()); // набор объектов - ключ, значение, в виде коллекции!
        //System.out.println(map1.keySet());// набо ключей от нашего словаря в виде коллекции
        //System.out.println(map1.values()); //получить значения
        //System.out.println(map1.size());
        //map1.remove(6);
        //System.out.println(map1.get(80));
        //map1.replace(5, "SPB");
       // System.out.println(map1); //выводит в виде строки
       // System.out.println(map1.containsKey("SPB")); - ответ тру или фолз
        for(Map.Entry<Integer, String> entry: map1.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf(" ключ: %d, значение: %s \n", key, value);
        }
        ArrayList<Integer> arr1 = new ArrayList<>(map1.keySet());
        System.out.println(arr1);
    }
}
