package lesson5.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
//        phoneBook();
        // Exercise 2;
        ex2();

    }

    private static void ex2() {
        List<String> users = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");

        List<String> usersFirstNames = new ArrayList<>();

        for (String user : users) {
            String userName = user.split(" ")[0];
            usersFirstNames.add(userName);
        }
        usersFirstNames.sort(Comparator.naturalOrder());

        Map<String, Integer> repeatNamesQuantityMap = new TreeMap<>();

        for (String name : usersFirstNames) {
            if (!repeatNamesQuantityMap.containsKey(name)){
                repeatNamesQuantityMap.put(name,1);
            } else {
                repeatNamesQuantityMap.replace(name, repeatNamesQuantityMap.get(name), repeatNamesQuantityMap.get(name)+1);
            }
        }

//        int count = 0;
//
//
//        for (int i = 0; i < usersFirstNames.size() - 1; i++) {
//            String currentName = usersFirstNames.get(i);
//            String nextName = usersFirstNames.get(i + 1);
//            count++;
//
//            if (!currentName.equalsIgnoreCase(nextName)) {
//                repeatNamesQuantityMap.put(currentName, count);
//                count = 0;
//            }
//        }
//            repeatNamesQuantityMap.put(usersFirstNames.get(usersFirstNames.size()-1), count > 0 ? count + 1 : 1);
        System.out.println(repeatNamesQuantityMap);

    }

    private static void phoneBook() {
        Map<String, Map<String, String>> phoneBook = new HashMap<>();

        phoneBook.put("Иванов Иван", Map.of("Домашний", "84955782321", "Мобильный", "89632124353"));

        phoneBook.put("Петров Сергей", Map.of("Домашний", "84955782321", "Мобильный", "89623124427"));

        phoneBook.put("Смирнов Георгий", Map.of("Домашний", "849556672561", "Мобильный", "89632124353"));

        phoneBook.put("Соколов Иван", Map.of("Домашний", "84955723111", "Мобильный", "89632165423"));

        phoneBook.forEach((key, value) -> System.out.printf("%s\t%s%n", key, value));
    }
}
