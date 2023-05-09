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
        System.out.println("\n" + "-----task_6");
        hw.listNum();

// 7.Необхідно вивести на екран таблицю множення на Х: (будь-яке число, що вводиться з консолі)
        System.out.println("\n" + "-----task_7");
        hw.multiplicationTable();

//8.  Створіть масив, що містить 10 перших непарних чисел. Виведіть елементи масиву на консоль в один рядок, розділяючи комою.
        System.out.println("\n" + "-----task_8");
        hw.CreateMassivNeParnyh();
        System.out.println();

//9.  Даний масив розмірності N, знайти найменший елемент масиву і вивести на консоль
        System.out.println("\n" + "-----task_9");
        int [] mass = {4,2,5,6,8,1,10};
        int min = hw.minNumberMass(mass);

        System.out.println("Минимальный элемент массива: " + min);

//10. У масиві із завдання 9. Визначити найбільший елемент.
        System.out.println("\n" + "-----task_10");
        int max = hw.maxNumberMass(mass);

        System.out.println("Максимальный элемент массива: " + max);

//11. Поміняти максимальний і найменший елементи масиву місцями. Приклад: дано масив {4, -5, 0, 6, 8}.
//    Після заміни виглядатиме {4, 8, 0, 6, -5}.
        System.out.println("\n" + "-----task_11");

        System.out.println("Начальный массив: ");
        hw.PrintMass(mass);
        System.out.println();

        System.out.println("Массив с измененными минимальным и максимальным элементами: ");
        hw.ChangeMassMinToMax(mass);
        System.out.println();

    }
}
