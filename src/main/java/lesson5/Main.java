package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ex0();
        fromRomeToArabic();
    }

    private static void fromRomeToArabic() {
        String romeNumber = "MMCMXCIX";
        int arabicNumber = 0;
        int prevNumber = -1;


        Map<Character, Integer> romeToArabicMap = new HashMap<>();
        romeToArabicMap.put('I', 1);
        romeToArabicMap.put('V', 5);
        romeToArabicMap.put('X', 10);
        romeToArabicMap.put('L', 50);
        romeToArabicMap.put('C', 100);
        romeToArabicMap.put('D', 500);
        romeToArabicMap.put('M', 1000);

//        if (romeNumber.length() == 1){
//            arabicNumber += romeToArabicMap.get(romeNumber.charAt(0));
//        } else {
//            for (int i = 0; i < romeNumber.length() - 1; i++) {
//                int currentNumber = romeToArabicMap.get(romeNumber.charAt(i));
//                int nextNumber = romeToArabicMap.get(romeNumber.charAt(i + 1));
//                if (currentNumber >= nextNumber) {
//                    arabicNumber += currentNumber;
//                    if (i == romeNumber.length() - 2) {
//                        arabicNumber += nextNumber;
//                    }
//                } else {
//                    arabicNumber += (nextNumber - currentNumber);
//                    i++;
//                }
//            }
//        }
        for (int i = 0; i < romeNumber.length(); i++) {
            int currentNum = romeToArabicMap.get(romeNumber.charAt(i));
            if (currentNum < prevNumber) {
                currentNum *= -1;
            }
            arabicNumber += currentNum;
            prevNumber = currentNum;
        }

        System.out.println(arabicNumber);
    }

    private static void ex0() {
        Map<String, String> passportsToFamilyNameMap = new HashMap<>();
        passportsToFamilyNameMap.put("123124", "Иванов");
        passportsToFamilyNameMap.put("124344", "Петров");
        passportsToFamilyNameMap.put("64545645644", "Колля");

//        System.out.println(passportsToFamilyNameMap);
//
//        for (Map.Entry<String,String> entry: passportsToFamilyNameMap.entrySet()) {
//            System.out.printf("%s\t%s%n", entry.getKey(),entry.getValue());
//        }
//        for (String key: passportsToFamilyNameMap.keySet()) {
//            System.out.printf("%s\t%s%n", key, passportsToFamilyNameMap.get(key));
//    }
        passportsToFamilyNameMap.forEach((key, value) -> System.out.printf("%s\t%s%n", key, value));
    }
}
