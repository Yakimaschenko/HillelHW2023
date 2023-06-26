package src.com.hillel.hw16;

import java.util.Random;
import java.util.Scanner;

public class MainSymbol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Завдання 2: findSymbolOccurance
//        System.out.print("Введіть рядок: ");
//        String input = scanner.nextLine();
//        System.out.print("Введіть символ: ");
//        char symbol = scanner.nextLine().charAt(0);
//        int occurrence = findSymbolOccurance(input, symbol);
//        System.out.println("Кількість входжень символу: " + occurrence);

        System.out.println("------------------");

//        // Завдання 3: findWordPosition
//        System.out.print("Введіть рядок source: ");
//        String source = scanner.nextLine();
//        System.out.print("Введіть рядок target: ");
//        String target = scanner.nextLine();
//        findWordPosition(source, target);
//        System.out.println("------------------");

//        // Завдання 4: stringReverse
//        System.out.print("Введіть рядок: ");
//        String sensense = scanner.nextLine();
//        String reversed = stringReverse(sensense);
//        System.out.println("Розвернутий рядок: " + reversed);
//        System.out.println("------------------");

//        // Завдання 5: isPalindrome
//        System.out.print("Введіть рядок: ");
//        String word = scanner.nextLine();
//        boolean palindrome = isPalindrome(word);
//        System.out.println("Чи є паліндромом: " + palindrome);

        // Завдання 6: Вгадування слова
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                          "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                         "pineapple", "pumpkin", "potato"};
        String secretWord = words[random.nextInt(words.length)];
        String guessedWord = "###############";

        while (!guessedWord.equals(secretWord)) {
            System.out.print("Введіть слово: ");
            String guess = scanner.nextLine();
            guessedWord = compareWords(secretWord, guess, guessedWord);

            System.out.println(guessedWord);
               if(guess.equalsIgnoreCase(secretWord)){
                System.out.println("Ви відгадали слово!");
                break;
            }
        }
    }


//    2. Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ. Необхідно обчислити, скільки разів символ зустрічається
//   в переданому рядку і повернути це числове значення.
    public static int findSymbolOccurance(String sensense, char sumbol){
        int count = 0;
        for(int i = 0; i< sensense.length(); i++){
            if(sensense.charAt(i) == sumbol){
                count++;
            }
        }
        return count;
    }

//    3. Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target). Необхідно з'ясувати, чи є target (підрядок)
//   частиною рядка source. Якщо так, тоді повернути номер позиції (індекс) першого елемента підрядка у рядку, інакше повернути -1.
public static void findWordPosition(String source, String target) {
        int count = 0;
        int position = source.indexOf(target);
        count++;
    System.out.println("Приклад " + count);
    System.out.println("Source " + source);
    System.out.println("Target " + target);
    System.out.println("Result " + position);
}

//4. Створити метод stringReverse. Метод приймає як параметр - рядок. Необхідно її розгорнути та повернути змінений варіант.
public static String stringReverse (String sensense){
    StringBuilder reversed = new StringBuilder(sensense);
    reversed.reverse();
    return reversed.toString();
}

//5. Створити метод isPalindrome. Метод приймає як параметр - рядок. Необхідно Перевірити, чи є переданий рядок паліндромом.
//   Якщо так, тоді повернуть true, інакше false.

    public static boolean isPalindrome (String sensense){
        String reversed = stringReverse(sensense);
        return sensense.equals(reversed);
    }
//6. *...
public static String compareWords (String secretWord, String guess, String guessedWord){
    StringBuilder result = new StringBuilder(guessedWord);
    int minLength = Math.min(secretWord.length(), guess.length());

    for (int i = 0; i < minLength; i++) {
        if (secretWord.charAt(i) == guess.charAt(i)) {
            result.setCharAt(i, guess.charAt(i));
        }
    }

    return result.toString();

}

}
