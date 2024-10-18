//Считать слова из файла, создать словарь,
// где ключи - это само слово, а значение - сколько раз оно встречается

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {

        //Map<String, Integer> map = new HashMap<>();
        //Создаем файл
        File file = new File("notes.txt");
        try {
            boolean creates = file.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //создаем Array лист
        ArrayList<String> arr = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("notes.txt"));
            // считывать до тех пор пока не закончится!!!
            while (sc.hasNext()) {
                arr.add(sc.next());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(arr);

        //создаем Словарь
        Map<String, Integer> map = new HashMap<>();
        //int kolvo = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {

                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else map.put(arr.get(i), 1);
        }

        System.out.println(map);

    }

}
