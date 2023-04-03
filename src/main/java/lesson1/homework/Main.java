package lesson1.homework;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
//        findMinAndMaxInArray();
        //Exercise 2
//        replaceElementsInArray();
        //Exercise 3
//        greetingsUser();
    }

    private static void greetingsUser() {
        Scanner in = new Scanner(System.in);
        int time = LocalTime.now().getHour();
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        if(time>=5 && time<12){
            System.out.printf("Доброе утро, %s!", name);
        } else if (time>=12 && time<18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (time>=18 && time<23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else{
            System.out.printf("Доброй ночи, %s!", name);
        }
    }

    private static void replaceElementsInArray() {
        int[] nums = new int[]{3, 2, 2, 3, 1, 5, 4, 3, 1, 2, 3};
        int val = 3;

        int rightBorder = nums.length - 1;
        for (int i = 0; i < rightBorder; i++) {
            if (nums[rightBorder] == val) {
                --rightBorder;
            }
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[rightBorder];
                nums[rightBorder] = temp;
            }
        }
        for (int num : nums) {
            System.out.printf("%d ", num);
        }
    }

    private static void findMinAndMaxInArray() {
        int[] array = new int[]{2, 5, 6, 1, 9, 14, 32, 4, 5, 1};
        int max = 0;
        int min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.printf("Max: %d\nMin: %d", max, min);
    }
}
