package com.hillel.hw17;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {
    @Test
    void addSimpleTest() {
        assertEquals(10, new SimpleMathLibrary().add(5, 5));
    }

    @Test
    void minusSimpleTest() {
        assertEquals(2, new SimpleMathLibrary().minus(5, 3));
    }

    @Test
    void resultAddSimpleTest() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int result = simpleMathLibrary.add(2, 5);
        assertEquals(7, result);
        //        if (result == 7) {
//            System.out.println("OK");
//        }else{
//            System.out.println("NOK");
//        }
    }

    @Test
    void resultMinusSimpleTest() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();
        int result = simpleMathLibrary.minus(5, 2);
        assertEquals(3, result);
//        if (result == 3) {
//            System.out.println("OK");
//        }else{
//            System.out.println("NOK");
//        }
    }

    @Test
    public void testExtractElementsAfterLastFour() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

        int[] massiv1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected1 = {1, 7};
        int[] result1 = simpleMathLibrary.extractElementsAfterLastFour(massiv1);
        assertArrayEquals(expected1, result1);

        int[] massiv2 = {4, 1, 6, 2, 4, 9, 8};
        int[] expected2 = {9, 8};
        int[] result2 = simpleMathLibrary.extractElementsAfterLastFour(massiv2);
        assertArrayEquals(expected2, result2);

        int[] massiv3 = {45, 2, 4, 0, 4, 10, 15};
        int[] expected3 = {10, 15};
        int[] result3 = simpleMathLibrary.extractElementsAfterLastFour(massiv3);
        assertArrayEquals(expected3, result3);
    }



    @Test
    public void testCheckArrayComposition() {
        SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

        int[] massiv1 = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean expected1 = true;
        boolean result1 = simpleMathLibrary.checkArrayComposition(massiv1);
        assertEquals(expected1, result1);

        int[] massiv2 = {1, 1, 1, 1, 1, 1};
        boolean expected2 = false;
        boolean result2 = simpleMathLibrary.checkArrayComposition(massiv2);
        assertEquals(expected2, result2);

        int[] massiv3 = {4, 4, 4, 4};
        boolean expected3 = false;
        boolean result3 = simpleMathLibrary.checkArrayComposition(massiv3);
        assertEquals(expected3, result3);

        int[] massiv4 = {1, 4, 4, 1, 1, 4, 3};
        boolean expected4 = true;
        boolean result4 = simpleMathLibrary.checkArrayComposition(massiv4);
        assertEquals(expected4, result4);
    }
}