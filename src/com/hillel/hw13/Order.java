package src.com.hillel.hw13;

public class Order {

    //Даний клас містить номер замовлення та ім'я людини, що його замовила.
    private int numberOrder;
    private String customerName;

    public Order(int numberOrder, String customerName) {
        this.numberOrder = numberOrder;
        this.customerName = customerName;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public String getCustomerName() {
        return customerName;
    }
}
