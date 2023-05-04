package src.com.hillel.hw2;

import java.util.Scanner;

public class AvgArithmeticNumber {


    public static void main(String[] args) {
        String value = "0.0";
        Double avg = 0d;
        Double sum = 0d;
        Double number = 0d;
        int colNumber = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Введите кол-во чисел: ");
        colNumber = scan.nextInt();

        for(int i=1; i<=colNumber; i++){
            System.out.println("Введите число " + i + ": ");
            number = scan.nextDouble();
            sum += number;
        }

        avg = sum / colNumber;
        System.out.println("Среднее арифметическое введенных чисел = " + avg);
    }


}
