package src.com.hillel.hw2;

import java.util.Scanner;

public class AvgDynamicNumber {


    public static void main(String[] args) {
        String values = "0.0";
        Double avg = 0d;
        Double sum = 0d;
        Double number = 0d;
        int colNumber = 0;

        Scanner scan = new Scanner(System.in);

        while (!values.equals("=")){
            number = Double.parseDouble(values);
            sum = sum + number;
            System.out.println("Введите число или знак "+ "'='" + " для того, чтоб посчитать среднее арифметическое введенных чисел: ");
            values = scan.nextLine();
            colNumber++;
        }
        System.out.println(values);
        System.out.println(sum);

        avg = sum / --colNumber;
        System.out.println("Cреднее арифметическое введенных чисел:" + avg);

    }


}
