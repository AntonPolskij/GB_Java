package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Boolean flag = true;
        Scanner in = new Scanner(System.in);

        LinkedList<String> list = new LinkedList<>();
        while (flag) {
            String inputText = in.nextLine();
            if (inputText.equals("q")) {
                flag = false;
            } else {
            String[] splitText = inputText.split("\\~");
            int index = Integer.parseInt(splitText[1]);
            String text = splitText[0];

                if (index < list.size()) {
                    if (text.equals("print")) {
                        System.out.println(list.get(index) == null ? "нет значения" : list.get(index));
                        list.remove(index);
                    }
                    else {
                        list.set(index, text);
                    }
                } else {
                    for (int i = list.size(); i < index-1; i++){
                        list.add(null);
                    }
                    list.add(text);
                }
                System.out.println(list);
            }
        }
    }

}
