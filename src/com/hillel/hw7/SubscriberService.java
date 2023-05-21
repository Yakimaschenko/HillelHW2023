package src.com.hillel.hw7;

public interface SubscriberService {

//
//    Створити інтерфейс (SubscriberService) та його реалізацію (SubscriberServiceImpl) для вибірки даних
//    та вивести ці дані на консоль.
//
//    a) відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий;
    //internalConversationsExceedsTheSpecifiedTime
//    b) відомості про абонентів, які користувалися міжміським зв'язком;
    //subscribersWhoUsedLongDistanceCommunication
//    c) відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр.
    //InformationNamePhoneNumberBalance
//    d) сумарне споживання трафіку інтернету для певного міста
    //sumInternetTrafficForAcertainCity
//    e) кількість абонентів з негативним балансом
    //countOfSubscribersWithAnegativeBalance


    void internalConversationsExceedsTheSpecifiedTime(int duration);
    void subscribersWhoUsedLongDistanceCommunication();
    void InformationNamePhoneNumberBalance(String firstlaterLastName);
    void sumInternetTrafficForAcertainCity(String City);
    void countOfSubscribersWithAnegativeBalance();

}
