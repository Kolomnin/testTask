package test.hashmap;


import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class HashMapApplication {

    public static void main(String[] args) {
        String[] arr = {"1", "3", "4", "5", "1", "5", "4"}; // Исходный массив

        // Создаем пустой список
        List<String> list = new ArrayList<>();

        // Добавляем в список элементы массива
        Collections.addAll(list, arr);

        // Выводим список
        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();

        // Подсчитываем вхождения элементов
        for (String num : list) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        // map.put(num, map.getOrDefault(num, 0) + 1):
        // добавляем или обновляем запись в map с ключом num и значением, равным текущему
        // количеству вхождений + 1. Если ключ num уже есть в map, его значение обновляется,
        // если ключа нет, он добавляется в map с начальным значением 1.
        printMap(map);
    }

    public static void printMap(Map<String, Integer> map) {

        String result = map.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .collect(Collectors.joining(", ", "{", "}"));

        // Выводим результат
        System.out.println(result);
    }

}

