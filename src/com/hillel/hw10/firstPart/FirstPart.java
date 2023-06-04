package src.com.hillel.hw10.firstPart;

import java.util.*;

public class FirstPart {
//1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
// Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
// Порахувати скільки разів зустрічається переданий рядок як другий аргумент.


    public int countOccurance(List<String> list, String value){
        int count = 0;
        for(String world : list){
            if(world.equalsIgnoreCase(value)){
                count++;
            }
        }
        return count;
    }
    //2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
    // Конвертувати масив у список відповідного типу даних та повернути з методу.
    //Наприклад:
    //Було Array [1, 2, 3]
    //Стало List [1, 2, 3]
    public List<String> toList(String[] massiv){
        List<String> list= new ArrayList<>();
        for(String arr: massiv){
            list.add(arr);
        }
        return list;
    }
//3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень,
// які можуть повторюватися в необмеженій кількості. Необхідно повернути новий числовий список, що містить тільки унікальні числа.
    public Set<Integer> uniqueValues(List<Integer> values){
    return new HashSet<>(values);
}

    //4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр.
    // Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
    // Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
    //Наприклад:
    //bird: 2
    //fox: 1
    //cat: 1
    public static void calcOccurance(List<String> list){
        Map<String, Integer> map = new HashMap<>();

        for (String word : list) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String world = entry.getKey();
            int count = entry.getValue();
            System.out.println(world + " = "+count);
        }

    }
        public String getRandomWord(List<String> words){
            return words.get((int) (Math.random()*10));
        }

}
