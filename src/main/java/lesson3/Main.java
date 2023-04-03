package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ex0();
//        ex1();
        ex2();
    }

    private static void ex2() {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        int counter = 1;
        for (int i = 0; i < 20; i++) {
            list.add(planets[random.nextInt(planets.length)]);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(i + 1))) {
                sb.append(list.get(i)).append(" " + counter + "\n");
                counter = 0;
            }
            counter++;
        }
        sb.append(list.get(list.size() - 1) + " ").append(counter > 0 ? counter : "");
        System.out.println(sb);
    }

    private static void ex1() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }

}
