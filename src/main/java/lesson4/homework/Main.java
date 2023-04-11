package lesson4.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
//        stringListApp();
        // Exercise 2
        LinkedList<Object> listForExTwo = new LinkedList<>();
        listForExTwo.add("one");
        listForExTwo.add("two");
        listForExTwo.add("three");
        listForExTwo.add("four");
        listForExTwo.add(5);
        listForExTwo.add(true);
        listForExTwo.add('g');
        System.out.println(returnReverseList(listForExTwo));
    }

    private static LinkedList<Object> returnReverseList(LinkedList<Object> list) {
       int leftIndex = list.size()-1;
        for (int i = 0; i < leftIndex; i++) {
            Object temp = list.get(i);
            list.set(i, list.get(leftIndex));
            list.set(leftIndex,temp);
            leftIndex--;
        }
        return list;
    }

    private static void stringListApp() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while(true){
            System.out.print("Введите строку: ");
            String text = in.nextLine();

            if (text.equalsIgnoreCase("print")){
                System.out.println(list);
            }else if (text.equalsIgnoreCase("revert")){
                try{
                    list.remove(0);}
                catch (IndexOutOfBoundsException e){
                    System.out.println("Список пуст.");
                    continue;
                }
            }else if (text.equalsIgnoreCase("quit")){
                break;
            } else {
                list.add(0,text);
            }
        }
    }
}
