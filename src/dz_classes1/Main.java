package dz_classes1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Создаем коллекцию из массива
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Россия","США", "Германия","Франция","Италия","Турция","Испания","Нидерланды", "США","Гваделуппа","Россия"));
        System.out.println(stringList);

        Set<String> unik = new HashSet<>();

        // Создаем коллекцию из уникальных значений
        unik.addAll(Arrays.asList("Россия","США", "Германия","Франция","Италия","Турция","Испания","Нидерланды", "США","Гваделуппа"));
        System.out.println(unik);

        // Считаем сколько раз встречается каждый элемент

        for (int i = 0; i < stringList.size(); i++) {

            
            System.out.println(stringList.get(i));
        }





        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();

      map.put("Vaska", 3);
      map.put("Murka", 4);
      map.put("Barsik", 2);
      map.put("Murka", 7);

        System.out.println(map);

        map.forEach((k, v) -> {
            System.out.println("key = " + k + " value = " + v);
        });

        for (Map.Entry<String, Integer> entry: map.entrySet() ) {
            System.out.println("key = " + entry.getKey() + " value = "+ entry.getValue());
        }



    }
}
