package p1706;

import java.util.*;

//1. Заполнить HashMap 10 объектами <Integer, String>.
//Найти строки у которых ключ>5  вывести строки через запятую.
//1.1 Перемножить все ключи, у которых соответствующая строка
// состоит из более чем 5 элементов.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        List<String> newList = new ArrayList<>();
        map.put(0, "one");
        map.put(1, "two");
        map.put(2, "tree");
        map.put(3, "four");
        map.put(4, "fifgffve");
        map.put(5, "six");
        map.put(6, "seven");
        map.put(7, "eight");
        map.put(8, "niffffne");
        map.put(9, "tenfffff");

        for (Map.Entry<Integer, String> mp : map.entrySet()) {
            if (mp.getKey() > 5) {
                newList.add(mp.getValue());
            }
        }
        int key = 1;
        Set<Integer> keyList = map.keySet();
        for (Integer mapkey : keyList) {
            String mapValue = map.get(mapkey);
            if (mapValue.length() > 5) {
                key = key*mapkey;
            }
        }
        System.out.println("ключи умножили "+key);
    }
}
