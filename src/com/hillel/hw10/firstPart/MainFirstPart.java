package src.com.hillel.hw10.firstPart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFirstPart {
    public static void main(String[] args) {
        FirstPart firstPart = new FirstPart();

        List<String> list= List.of("Книга","Книга","Мебель","Стул","Стол","Носок","Дверь", "Кросовок","Книга","Книга","Носок","Дверь", "Кросовок");
        String value = "Книга";
        System.out.println("-----...1...------");
        int respond = firstPart.countOccurance(list, value);
        System.out.println("В тексте указанное слово встречается - " + respond +" раз...");
        System.out.println("------------");

        System.out.println("-----...2...------");
        String[] massiv = {"1","2","3","4","5","6","7","8","9"};
        System.out.println("Було:  " + Arrays.deepToString(massiv));
        System.out.println("Стало: " + firstPart.toList(massiv));
        System.out.println("------------");

        System.out.println("-----...3...------");
        List<Integer> values = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 2, 2, 4, 5, 6, 7);
        System.out.println(firstPart.uniqueValues(values));
        System.out.println("------------");

        System.out.println("-----...4...------");
        firstPart.calcOccurance(list);

        System.out.println("------------");

        System.out.println(firstPart.getRandomWord(list));





    }
}
