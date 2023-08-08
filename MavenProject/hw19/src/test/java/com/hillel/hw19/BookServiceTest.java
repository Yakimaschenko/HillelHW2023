package com.hillel.hw19;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<Product>findCheapestBooks = BookService.findCheapestBooks(productList);
//
////        assertEquals(2,discountedBooks.size());
////        assertEquals( "Book",discountedBooks.get(0).getType());
//        assertEquals(200,findCheapestBooks);

    }


}