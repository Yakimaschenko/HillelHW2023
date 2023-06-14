package src.com.hillel.hw10.phonebook;

import java.util.List;

public class MainPhoneBook {
    private static String name;

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Igor","+380630001100");
        phoneBook.add("Boris","+380931111100");
        phoneBook.add("Andrey","+380632221150");
        phoneBook.add("Igor","+380633331100");
        phoneBook.add("Marina","+380634441122");
        phoneBook.add("Igor","+380635551130");
        phoneBook.add("Marina","+380636661140");

        System.out.println("---------------");

        System.out.println(phoneBook.find("Andrey"));
        System.out.println(phoneBook.find("Igor"));

        System.out.println("-----");
        phoneBook.findAll("Igor");





    }
}
