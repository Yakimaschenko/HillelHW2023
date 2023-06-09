package src.com.hillel.hw5;

public class Employee {

//    2. Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int    age;


    public Employee(String fio, String position, String email, String phone, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "fio employee='" + fio + '\'' +
//                ", position employee='" + position + '\'' +
//                ", email employee='" + email + '\'' +
//                ", phone employee=" + phone +
//                ", age employee=" + age +
//                '}';
//    }
}
