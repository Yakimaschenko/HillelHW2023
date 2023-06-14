package src.com.hillel.hw10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

//    Private List<Subscriber>sub;
//
//    public PhoneBook(){
//        this.sub = new ArrayList();
//    }
    private static ArrayList<Subscriber> subscribersList;

    public PhoneBook() {
        this.subscribersList = new ArrayList<>();
    }

    public void add(String name, String phone){
        Subscriber subscriber = new Subscriber(name, phone);
        subscribersList.add(subscriber);
        System.out.println(subscriber.getName() +"... " + subscriber.getPhone());
    }

    public void printPhoneBook(List<String> list){
        for (String lists : list){
            System.out.println(lists);
        }
    }

    public static Subscriber find(String name){
        for(Subscriber subscriber : subscribersList){
            if(subscriber.getName().equalsIgnoreCase(name)){
                return subscriber;
            }
        }
     return null;
    }

    public    List<Subscriber> findAll(String name){
        List<Subscriber> list = new ArrayList<>();
        for (Subscriber listWords : subscribersList){
            if(listWords.getName().equalsIgnoreCase(name)){
                list.add(listWords);
                System.out.println(name + listWords.getPhone());
            }

        }
        return list;
    }




}
