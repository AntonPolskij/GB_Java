package lesson1;

import java.util.Scanner;

public class MainClassFromLessonOne {
    public static void main(String[] args) {
        inputNameAndPrint();
        findMaxFrequiencyCount();
    }

    private static void findMaxFrequiencyCount() {

        int counter = 0;
        int maxValue = 0;
        int[] arr = new int[]{1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        for (int i : arr) {
            if (i == 1) {
                counter++;
                if (counter > maxValue) {
                    maxValue = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(maxValue);
    }

    private static void inputNameAndPrint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.printf("Привет %s", name);
    }

}
