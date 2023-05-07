package src.com.hillel.hw3;

import static src.com.hillel.hw3.Hw3Apps.*;

public class Main {
    public static void main(String[] args) {

        Hw3Apps hw = new Hw3Apps();
//1. За допомогою циклу for вивести на екран непарні числа від 1 до 99.
        System.out.println("-----task_1-----");
        hw.forPrintFrom1to99();

//2.  Дано число n за допомогою циклу for порахувати факторіал n!
        System.out.println("\n" + "-----task_2-----");
        int result = PrintFaktorialN(3);
        System.out.println(result);

//3. Перепишіть програми 1 та 2 за допомогою циклу while.
        System.out.println("\n" + "-----task_3-----part1-----");
        hw.whileDoPrintFrom1to99();

        System.out.println("\n" + "-----task_3-----part2-----");
        int result3 = whileDoPrintFaktorialN(3);
        System.out.println(result3);

//4.Перепишіть програми 1 та 2 із використанням циклу do - while.
        System.out.println("\n" + "-----task_4-----part1-----");
        hw.doWhilePrintFrom1to99();

        System.out.println("\n" + "-----task_4-----part2-----");
        int result4 = doWhilePrintFaktorialN(3);
        System.out.println(result4);

//5. Дано змінні x і n обчислити x^n.
        System.out.println("\n" + "-----task_5");
        hw.degreeMultiplication(3, 4);

//6.Вивести 10 перших чисел послідовності 0, -5,-10,-15.

// 7.Необхідно вивести на екран таблицю множення на Х: (будь-яке число, що вводиться з консолі)
        System.out.println("\n" + "-----task_7");
        hw.multiplicationTable();
    }
}
