package src.com.hillel.hw3;

import java.util.Scanner;

public class Hw3Apps {

//1. За допомогою циклу for вивести на екран непарні числа від 1 до 99.
    public void forPrintFrom1to99() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
//2.  Дано число n за допомогою циклу for порахувати факторіал n!

    public static int PrintFaktorialN(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

//3. Перепишіть програми 1 та 2 за допомогою циклу while.
    public void whileDoPrintFrom1to99() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i++ + " ");
            i++;
        }
    }

    public static int whileDoPrintFaktorialN(int f) {
        int result = 1;
        int i = 1;
        while (result < f) {
            result = result * i;
//            System.out.println(result);
            i++;
        }
        return result;
    }

//4. Перепишіть програми 1 та 2 із використанням циклу do - while.
    public void doWhilePrintFrom1to99() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i++ + " ");
            i++;
        } while (i <= 100);
    }


    public static int doWhilePrintFaktorialN(int f) {
        int result = 1;
        int i = 1;
        do {
            result = result * i;
//            System.out.println(result);
            i++;
        } while (result < f);
        return result;
    }

//5. Дано змінні x і n обчислити x^n.
    public void degreeMultiplication(int x, int n){

        int degree = 1;
        int result = 1;
        while (degree <= n) {
            result = result * x;
            degree++;
        }
        System.out.println(result);
    }

//6.Вивести 10 перших чисел послідовності 0, -5,-10,-15.


// 7.Необхідно вивести на екран таблицю множення на Х: (будь-яке число, що вводиться з консолі)
    public void multiplicationTable(){

        int x ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число по которому нужно вывести таблицу умножения: ");
        x = scan.nextInt();

        int y = 1;
        int result = 1;
        while(y <= 10){
            result = x * y;
            System.out.println(x + " умножить на  " + y + " = " + result);
            y++;
        }
    }

//8.  Створіть масив, що містить 10 перших непарних чисел. Виведіть елементи масиву на консоль в один рядок, розділяючи комою.
//9.  Даний масив розмірності N, знайти найменший елемент масиву і вивести на консоль
//10. У масиві із завдання 9. Визначити найбільший елемент.
//11. Поміняти максимальний і найменший елементи масиву місцями. Приклад: дано масив {4, -5, 0, 6, 8}. Після заміни виглядатиме {4, 8, 0, 6, -5}.


}

