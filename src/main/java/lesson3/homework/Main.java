package lesson3.homework;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println(deleteEvenNumbers());
        // Exercise 2
        FindMinMaxAvg();
        // Exercise 3
        System.out.println(deleteDuplicateValues());
        // Exercise 4
        System.out.println(deleteNums());
    }

    private static List<String> deleteNums() {
        String[] array = new String[] {"asdas","qweqw","4","asdbbg","5","6","qkjh"};
        List<String> list = new ArrayList<>(Arrays.asList(array));


        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (NumberFormatException e){
                continue;
            }
        }
        return list;
    }

    private static void FindMinMaxAvg() {
        int listLength = 10;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(1, 10));
        }

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        int avg = 0;

        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            } else if (integer > max) {
                max = integer;
            }
            sum += integer;
        }
        avg = sum/list.size();
        String solution = "Min: " + min + "\n" + "Max: " + max + "\n" + "Avg: " + avg;
        System.out.println(solution);
    }

    private static List<Integer> deleteEvenNumbers() {
        int listLength = 10;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            list.add(random.nextInt(1, 10));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    private static List<String> deleteDuplicateValues() {
        List<String> planets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(planets.get(random.nextInt(planets.size())));
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i + 1);
                i--;
            }
        }
        return list;
    }
}
