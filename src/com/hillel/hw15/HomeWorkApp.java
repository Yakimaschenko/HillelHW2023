package src.com.hillel.hw15;

public class HomeWorkApp {
    public static void main(String[] args) {

        HomeWorkApp homeWorkApp = new HomeWorkApp();

        homeWorkApp.printThreeWords("Orange, Banana, Apple");
        System.out.println("--------------------");

        homeWorkApp.checkSumSign();
        System.out.println("--------------------");

        homeWorkApp.printColor(10);
        System.out.println("--------------------");

        homeWorkApp.compareNumbers(10, 5);
        System.out.println("--------------------");

        System.out.println(homeWorkApp.compareIntegerNumbers(15, 4));
        System.out.println("--------------------");

        homeWorkApp.numberPositiveOrNegative(-1);
        System.out.println("--------------------");

        System.out.println(homeWorkApp.isNegative(-10));
        System.out.println("--------------------");

        homeWorkApp.printSentenses("Orange, Banana, Apple",4);
        System.out.println("--------------------");

        System.out.println(homeWorkApp.isLeapYear(2020));
        System.out.println("--------------------");

    }

//    2. Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
    public void printThreeWords(String words) {
        String[] arrayWords = words.split(",");
        for (String word : arrayWords) {
            System.out.println(word.trim());
        }
    }

//3. Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
//   Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна",
//   інакше - "Сума негативна";

    public void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

//    4. Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням. Якщо значення менше 0 (0 включно),
//       то в консоль метод повинен вивести повідомлення "Червоний", якщо лежить в межах від 0 (0 виключно) до 100 (100 включно),
//       то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";

    public void printColor(int value) {
        if (value < 0) {
            System.out.println("Червоний");
        } else if (value >= 0 && value < 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }
// 5. Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
//    Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;

    public void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

// 6. Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах від 10 до 20 (включно),
//    якщо так – повернути true, інакше – false.
    public boolean compareIntegerNumbers(Integer a, Integer b) {
        int c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
// 7. Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль, чи додатнє число передали або від’ємне.
//    Примітка: нуль вважаємо позитивним числом.

    public void numberPositiveOrNegative(Integer value){
        if(value >= 0){
            System.out.println("Число позитивне");
        }else {
            System.out.println("Число від'ємне");
        }
    }
// 8. Написати метод, якому як параметр передається ціле число. Метод повинен повернути true, якщо число є негативним,
//    і повернути false якщо позитивне.
    public boolean isNegative(Integer value){
        if(value < 0){
            return true;
        }else{
            return false;
        }
    }
//    9. Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль зазначений рядок,
//       вказану кількість разів;
    public void printSentenses(String sentenses, int number){
        for(int i = 0; i<number; i++){
            System.out.println(sentenses);
        }
    }
//   10. * Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false).
//   Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
        return false;
    }
}

}
