package com.hillel.hw18;

import com.hillel.hw18.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracticeWithStreamTest {

    //1
    @Test
    public void testAvgCollectionNumbers(){
        List<Integer> listIntegers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        double resultAvgNumber = 5.5;

        double avgCollectionNumbers = PracticeWithStream.avgCollectionNumbers(listIntegers);

        assertEquals(resultAvgNumber,avgCollectionNumbers);

    }

    //2
    @Test
    public void testConvertToUppercase() {
        List<String> listString = Arrays.asList("one","two","three","four","five");
        List<Pair<String,String>> resultStringList = Arrays.asList(
                new Pair<>("one","ONE"),
                new Pair<>("two","TWO"),
                new Pair<>("three","THREE"),
                new Pair<>("four","FOUR"),
                new Pair<>("five","FIVE")

        );

        List<Pair<String,String>> convertToUppercase = PracticeWithStream.convertToUppercase(listString);
        assertEquals(resultStringList,convertToUppercase);
    }

    //3

    @Test
    public void testFilterToLovercase() {
        List<String> listString = Arrays.asList("one","two","THREE","four","five");
        List<String> resultListString = Arrays.asList("four","five");


        List<String> filterToLovercase = PracticeWithStream.filterToLovercase(listString);
        assertEquals(resultListString,filterToLovercase);

    }
}