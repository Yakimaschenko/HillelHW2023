package src.com.hillel.hw2;

public class DepositCapitalCalculator {
    public static void main(String[] args) {

        double sumDeposit = Double.parseDouble(args[0]);
        double interestDeposit = Double.parseDouble(args[1]);
        int poriodYear = Integer.parseInt(args[2]);


        double balance = sumDeposit;
        double interestMonth = interestDeposit / 12.0 / 100.0;

        System.out.println("Начальный баланс вклада: " + balance + " uah");

        for (int i = 1; i <= poriodYear; i++) {
            System.out.println("Расчет для " + i + " года: ");
            double itogSum = 0;

            for (int j = 1; j <= 12; j++) {
                double itogSumMonth = balance * interestMonth;
                balance += itogSumMonth;
                itogSum += itogSumMonth;
            }

            System.out.printf("- Накопленная сумма: %.2f uah%n", balance);
            System.out.printf("- Нарастающий доход: %.2f uah%n", itogSum);
        }
    }

}