package com.hillel.hw19;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public static Product findCheapestBook( List<Product> productList) {
        Optional<Product> cheapestBook = productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .min((product1, product2) -> Double.compare(product1.getPrice(), product2.getPrice()));

        return cheapestBook.orElseThrow(() -> new RuntimeException("Продукт [категорія: Book] не знайдено"));
    }

    public static List<Product> getLastProducts(List<Product> productList) {
        List<Product> lastBooks = productList.stream().sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(3)
                .collect(Collectors.toList());

        return lastBooks;
    }

    public static double sumPriceOfBook(List<Product> productList, LocalDateTime currentDate) {
        double listSumPriceOfBook = productList.stream()
                .filter(p -> p.getType().equalsIgnoreCase("Book"))
                .filter(p -> p.getPrice() < 75)
                .filter(p -> p.getCreateDate().getYear() == currentDate.getYear())
                .mapToDouble(Product::getPrice)
                .sum();

        return listSumPriceOfBook;
    }

    public static Map<String, List<Product>> groupProductsOfType(List<Product> productList) {
        Map<String, List<Product>> listgroupProductsOfType = productList.stream()
                .collect(Collectors.groupingBy(Product::getType));

        return listgroupProductsOfType;
    }

}
