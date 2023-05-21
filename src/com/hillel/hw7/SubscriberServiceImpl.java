package src.com.hillel.hw7;

import java.util.Locale;

public class SubscriberServiceImpl implements SubscriberService{

//    a) відомості про абонентів, у яких час внутрішньоміських розмов перевищує заданий;
    @Override
    public void internalConversationsExceedsTheSpecifiedTime(int duration) {
        Subscriber[] subscribers = MassivSubscriber.geterationMassiv();
        for (Subscriber sub: subscribers){
            if(sub.getCityCallDuration() >= duration)
                System.out.println("Абонент у якого час внутрішньоміських розмов перевищує заданий - "+ sub);
        }
    }

//    b) відомості про абонентів, які користувалися міжміським зв'язком;
    @Override
    public void subscribersWhoUsedLongDistanceCommunication() {
        Subscriber[] subscribers = MassivSubscriber.geterationMassiv();
        for (Subscriber sub: subscribers){
            if(sub.getInterCityCallDuration() >0)
                System.out.println("Абонент який користувався міжміським зв'язком - "+ sub);
        }

    }

//    c) відомості про абонентів ПІБ, номер телефону, баланс - де перший бука прізвища передається як параметр.
    @Override
    public void InformationNamePhoneNumberBalance(String firstlaterLastName) {
        Subscriber[] subscribers = MassivSubscriber.geterationMassiv();
        String firstlaterLastNameLower = firstlaterLastName.toLowerCase();
        for (Subscriber sub: subscribers){
            if( sub.getLastName().toLowerCase().startsWith(firstlaterLastNameLower)) {
                System.out.println("Перша буква прізвища абонента співпадає з введенною - '" + firstlaterLastName.toUpperCase() + "' -  " + sub);
            }
        }
    }

//    d) сумарне споживання трафіку інтернету для певного міста
    @Override
    public void sumInternetTrafficForAcertainCity(String City) {
        Subscriber[] subscribers = MassivSubscriber.geterationMassiv();
        String CityLower = City.toLowerCase();
        int sumTrafic = 0;
        for (Subscriber sub : subscribers){
            if (CityLower.equalsIgnoreCase(sub.getCity())){
                sumTrafic += sub.getInternetTraffic();
            }
        }
        System.out.println(sumTrafic + " GB");

    }

//    e) кількість абонентів з негативним балансом
    @Override
    public void countOfSubscribersWithAnegativeBalance() {
        Subscriber[] subscribers = MassivSubscriber.geterationMassiv();
        int count = 0;
        for(Subscriber sub : subscribers){
            if(sub.getBalance() < 0 ){
                count++;
            }
        }
        System.out.println(count);
    }
}
