package com.hillel.hw19;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class BookService {

    public static List<Product> printCollectionExpensiveBooks(List<Product> productList) {
        List<Product> costexpensiveBooks = productList.stream()
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .filter(p -> p.getPrice() > 250).collect(Collectors.toList());
        return costexpensiveBooks;
    }


    public static void applyDiscount() {
        Product product = new Product();
        //product.setPrice(product.getPrice() * 0.9);
    }
//isDiscountProbably

public static List<Product> applyDiscountToBooks(List<Product> productList) {
    List<Product> costexpensiveBooks = productList.stream()
            .filter(p -> p.getType().equalsIgnoreCase("Book") && p.probablyDiscount())
            .map(p -> new Product(p.getType(), p.getPrice() * 0.9, false))
            .collect(Collectors.toList());

    return costexpensiveBooks;
}

    public static List<Product> findCheapestBooks(List<Product> productList) {
        List<Product> costexpensiveBooks = productList.stream()
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .min(Comparator.comparingDouble(Product::getPrice)).stream().collect(Collectors.toList());
//                .orElseThrow(() -> new NoSuchElementException("Product not find"));

        return costexpensiveBooks;
    }


}
