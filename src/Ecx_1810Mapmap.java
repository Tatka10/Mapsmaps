import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Упр. Создать массив слов. Сделать из него map, где слова
// будут ключами, а их длины - значениями.
//Потом сделать то же самое из ArrayList.

public class Ecx_1810Mapmap {
    public static void main(String[] args) {
        String[] mass = {"Корова", "Собака", "Конь", "Коза"};
        Map<String, Integer> map = new HashMap<>(); //должно быть 2 значения - ключ, значения
        //String a = "";
        for (String s : mass) {
//            String a = "";
//            a = a + mass[i];
            //          System.out.print(a);
//            map.put(a, i);
            map.put(s, s.length());
        }
        System.out.println(map + "\n");

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(mass)); //из массива сделали коллекцию
        Map<String, Integer> map1 = new HashMap<>();
        //System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            map1.put(arr.get(i),arr.get(i).length());
        }
        System.out.println(map1);


    }


}

