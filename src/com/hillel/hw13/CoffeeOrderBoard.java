package src.com.hillel.hw13;

import src.com.hillel.hw12.FileData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeOrderBoard {


    private List<Order> orderList;
    private int orderNumber;

    public CoffeeOrderBoard() {
        orderList = new ArrayList<>();
        orderNumber = 1;
    }

    public void add(String customerName){
        Order order = new Order(orderNumber, customerName);
        orderList.add(order);
        orderNumber++;
    }

    private int findIndexForList(int orderNumber){
        for(int i = 0; i < orderList.size(); i++){
           if(orderList.get(i).getNumberOrder() == orderNumber){
            return i;
           }
        }
        return -1 ;
    }

    public void deliver(int orderNumber){
        int index = findIndexForList(orderNumber);
        if (index != -1) {
            Order order = orderList.get(index);
            System.out.println("Ордер заказа: " + order.getNumberOrder() + " | " + order.getCustomerName());
            orderList.remove(index);
        } else {
            System.out.println("Указаный ордер не найден.");
        }
    }

    public void print(){
        System.out.println("Num | Name");
        for(Order order:orderList){
            System.out.println( order.getNumberOrder() + " | " + order.getCustomerName());
        }
    }




}
