package lesson2.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
//        isPalindrome("AnNA");
        // Exercise 2
//        writeInFile("src/main/resources/files/homework2.txt",doString("TEST"));
        // Exercise 3
        logTypeOfFiles("C:\\Users\\polsk\\Desktop\\Git\\GB_Java\\src\\main\\java\\lesson2\\homework");
    }

    private static void isPalindrome(String stringForCheck) {
        char[] stringInArray = stringForCheck.toCharArray();
        StringBuilder reverseString = new StringBuilder();
        for (int i = stringForCheck.length() - 1; i > -1; i--) {
            reverseString.append(stringInArray[i]);
        }
        System.out.println(stringForCheck.equalsIgnoreCase(reverseString.toString()) ? "Palindrom" : "NOT Palindrom");
    }


    private static String doString(String string1) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append(string1);
        }
        return result.toString();
    }

    private static void writeInFile(String fileName, String strToWrite) {
        try (PrintWriter pw = new PrintWriter(fileName);) {
            pw.print(strToWrite);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logTypeOfFiles(String pathDir) {
        File file = new File(pathDir);

        if (!file.isDirectory()) {
            return;
        }

        String[] dirListNames = file.list();

        for (String currentFile : dirListNames) {
            String fileExtension = currentFile.split("\\.")[1];

            System.out.println("Расширение файла: " + fileExtension);
        }
    }
}
