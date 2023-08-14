package com.hillel.hw19;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    public void  testPrintCollectionBooks(){

        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",200.0));
        productList.add(new Product("Book", 300.0));
        productList.add(new Product("Book",400.0));
        productList.add(new Product("Toy",500.0));
        productList.add(new Product("Toy",100.0));
        productList.add(new Product("Book",100.0));

        List<Product> expensiveBooks = BookService.printCollectionExpensiveBooks(productList);

        assertEquals(2, expensiveBooks.size());
        assertEquals("Book",expensiveBooks.get(1).getType());
        assertEquals(300,expensiveBooks.get(0).getPrice());
        assertEquals("Book",expensiveBooks.get(1).getType());

    }

    @Test
    public void testApplyDiscountToBooks(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",200.0, true));
        productList.add(new Product("Book", 300.0,true));
        productList.add(new Product("Toy",400.0, true));

        List<Product>discountedBooks = BookService.applyDiscountToBooks(productList);

        assertEquals(2,discountedBooks.size());
        assertEquals( "Book",discountedBooks.get(0).getType());
        assertEquals(270,discountedBooks.get(1).getPrice());

    }

    @Test
    public void testFindCheapestBooks(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",200.0, true));
        productList.add(new Product("Book", 300.0,true));
        productList.add(new Product("Toy",400.0, true));

//        List<Product>findCheapestBooks = BookService.findCheapestBooks(productList);
        List<Product>findCheapestBooks = Collections.singletonList(BookService.findCheapestBook(productList));

////        assertEquals(2,discountedBooks.size());
////        assertEquals( "Book",discountedBooks.get(0).getType());
        assertEquals(200,findCheapestBooks.get(0).getPrice());

    }


    @Test
    public void testgetLastProducts(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",200.0, true, LocalDateTime.of(2023,8,1,10,0)));
        productList.add(new Product("Book", 300.0,true, LocalDateTime.of(2023,8,2,14,30)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,1,15,45)));
        productList.add(new Product("Toy",200.0, true, LocalDateTime.of(2023,8,3,11,20)));
        productList.add(new Product("Toy", 300.0,true, LocalDateTime.of(2023,8,5,22,15)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,20,10,2)));

        List<Product>getLastProducts = BookService.getLastProducts(productList);

        assertEquals(3,getLastProducts.size());
        assertEquals( "Toy",getLastProducts.get(0).getType());
        assertEquals( "Toy",getLastProducts.get(0).getType());
        assertEquals( "Toy",getLastProducts.get(0).getType());

    }

    @Test
    public void testsumPriceOfBook(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",50.0, true, LocalDateTime.of(2023,8,1,10,0)));
        productList.add(new Product("Book", 30.0,true, LocalDateTime.of(2023,8,2,14,30)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,1,15,45)));
        productList.add(new Product("Toy",200.0, true, LocalDateTime.of(2023,8,3,11,20)));
        productList.add(new Product("Toy", 300.0,true, LocalDateTime.of(2023,8,5,22,15)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,20,10,2)));

        double listsumPriceOfBook = BookService.sumPriceOfBook(productList,LocalDateTime.of(2023,8,1,10,0));

        assertEquals(80,listsumPriceOfBook);

    }


    @Test
    public void testgroupProductsOfType(){
        List<Product> productList= new ArrayList<>();
        productList.add(new Product("Book",50.0, true, LocalDateTime.of(2023,8,1,10,0)));
        productList.add(new Product("Book", 30.0,true, LocalDateTime.of(2023,8,2,14,30)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,1,15,45)));
        productList.add(new Product("Toy",200.0, true, LocalDateTime.of(2023,8,3,11,20)));
        productList.add(new Product("Toy", 300.0,true, LocalDateTime.of(2023,8,5,22,15)));
        productList.add(new Product("Toy",400.0, true, LocalDateTime.of(2023,8,20,10,2)));

        Map<String, List<Product>> listgroupProductsOfType = BookService.groupProductsOfType(productList);

        assertEquals(2,listgroupProductsOfType.get("Book").size());
        assertEquals(4,listgroupProductsOfType.get("Toy").size());

    }

}