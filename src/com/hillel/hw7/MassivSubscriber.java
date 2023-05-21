package src.com.hillel.hw7;

public class MassivSubscriber {

    public static Subscriber[] geterationMassiv(){
        Subscriber[] massiv = new Subscriber[10];

        massiv[0] = new Subscriber(1,"Travolta","John","Kyiv","+380630001100",
                "111", 1000.2, 30,0,30);

        massiv[1] = new Subscriber(2,"Shevchenko","Taras","Kyiv","+380931111100",
                "121", 100.3, 40,0,10);

        massiv[2] = new Subscriber(3,"Ukrainka","Lesya","Kyiv","+380972220022",
                "123", 2000.5, 20,0,25);

        massiv[3] = new Subscriber(4,"Skovoroda","Grygoriy","Vinnytsa","+380502221100",
                "133", 3400.2, 24,55,15);

        massiv[4] = new Subscriber(5,"Bdgilka","Mariya","Hmelnytsky","+380975552200",
                "543", 154.2, 17,43,44);

        massiv[5] = new Subscriber(6,"Tven","Mark","LosAndgeles","+380637771505",
                "777", -7500.0, 77,0,77);

        massiv[6] = new Subscriber(7,"Begbeder","Friderik","Dnipro","+380632341199",
                "834", 8000.2, 550,0,80);

        massiv[7] = new Subscriber(8,"Zeleniy","Boris","NewYork","+380998761101",
                "657", -140.2, 110,0,53);

        massiv[8] = new Subscriber(9,"Stalone","Silvester","Dnipro","+380630356100",
                "987", 3800.2, 530,0,98);

        massiv[9] = new Subscriber(10,"Lungren","Dolf","Harkiv","+380937280000",
                "579", 420.6, 57,94,340);

        return massiv;
    }
}
