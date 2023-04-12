package lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        int[] randomArray = new int[1000];
        fillArray(randomArray);
        float uniqueValue = uniquePercent(randomArray);
        System.out.println(uniqueValue);
    }
    private static void fillArray(int[] array){
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(array));
    }

    private static float uniquePercent(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int number : array) {
            set.add(number);
        }
        System.out.println(set);
        return 1.0f * set.size()*100/ array.length;

    }
}
