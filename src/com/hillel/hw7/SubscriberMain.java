package src.com.hillel.hw7;

import org.w3c.dom.ls.LSOutput;

public class SubscriberMain {
    public static void main(String[] args) {

        SubscriberService subscriberService = new SubscriberServiceImpl();
        System.out.println("1. Відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий... ");
        subscriberService.internalConversationsExceedsTheSpecifiedTime(540);
        System.out.println();

        System.out.println("2. Відомості про абонентів, які користувалися міжміським зв'язком... ");
        subscriberService.subscribersWhoUsedLongDistanceCommunication();
        System.out.println();

        System.out.println("3. Відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр... ");
        subscriberService.InformationNamePhoneNumberBalance("T");
        System.out.println();

        System.out.println("4. Cумарне споживання трафіку інтернету для певного міста... ");
        subscriberService.sumInternetTrafficForAcertainCity("Kyiv");
        System.out.println();

        System.out.println("4. Кількість абонентів з негативним балансом... ");
        subscriberService.countOfSubscribersWithAnegativeBalance();
        System.out.println();




    }
}
