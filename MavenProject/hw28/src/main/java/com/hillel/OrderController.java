package com.hillel;

import com.google.gson.Gson;
import spark.Spark;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

//http://localhost:4567/order

public class OrderController {

        private static final OrderRepository orderRepository = new OrderRepository();
        private static final Gson gson = new Gson();

        public static void main(String[] args) {
            Spark.port(4567);

            // Додавання замовлення
            Spark.post("/orders", (req, res) -> {
                Order order = gson.fromJson(req.body(), Order.class);
                orderRepository.addOrder(order);
                return "Order added with ID: " + order.getId();
            });

            // Отримання конкретного замовлення за ID
            Spark.get("/orders/:id", (req, res) -> {
                int id = Integer.parseInt(req.params("id"));
                Order order = orderRepository.getOrderById(id);
                if (order != null) {
                    return gson.toJson(order);
                } else {
                    res.status(404);
                    return "Order not found";
                }
            });

            // Отримання всіх замовлень
            Spark.get("/orders", (req, res) -> {
                List<Order> allOrders = orderRepository.getAllOrders();
                return gson.toJson(allOrders);
            });
        }
    }



