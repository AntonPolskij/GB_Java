package lesson2;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        int N = 5;
        String stringForExTwo = "aaaabbcddrrgf";
//        printStringOfNChars(N);
//        compressString(stringForExTwo);
        ex5("C:\\Users\\polsk\\Desktop\\Git\\GB_Java");
    }

    static void printStringOfNChars(int N) {
        char c1 = 'a';
        char c2 = 'B';
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                resultString.append(c1);
            } else {
                resultString.append(c2);
            }
        }
        System.out.println(resultString.toString());
    }

    static void compressString(@NotNull String stringInstance) {
        int counter = 1;
        char[] arrayOfChars = stringInstance.toCharArray();
        StringBuilder solutionString = new StringBuilder();
        solutionString.append(arrayOfChars[0]);
        for (int i = 1; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] != arrayOfChars[i - 1]) {
                solutionString.append(counter > 1 ? counter : "").append(arrayOfChars[i]);
                counter = 0;
            }
            counter++;
        }
        solutionString.append(counter > 1 ? counter : "");
        System.out.println(solutionString.toString());
    }

    private static void ex5(String pathDir) {
        File file = new File(pathDir);
        if (!file.isDirectory()) {
            return;
        }

        String[] dirListNames = file.list();

        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/files/output.txt");) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
