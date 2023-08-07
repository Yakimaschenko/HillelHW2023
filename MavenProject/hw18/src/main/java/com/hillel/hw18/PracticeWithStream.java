package com.hillel.hw18;

import com.hillel.hw18.util.Pair;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
//import javafx.util.stream.Collectors;


public class PracticeWithStream {

//    public static void main(String[] args) {
//        List<Integer> listIntegers = new ArrayList<>();
//
//        listIntegers.add(1);
//        listIntegers.add(2);
//        listIntegers.add(3);
//        listIntegers.add(4);
//        listIntegers.add(5);
//        listIntegers.add(6);
//        listIntegers.add(7);
//        listIntegers.add(8);
//        listIntegers.add(9);
//        listIntegers.add(10);
//
//
//
//        System.out.println(avgCollectionNumbers(listIntegers));
//    }

    //1 - Имеется коллекция из Integes, использую стримы посчитать среденее значения всех чисел
    public static double avgCollectionNumbers(List<Integer> list){
     OptionalDouble resultList = list.stream().mapToDouble(Integer::doubleValue).average();
     return resultList.orElse(0.0);
    }

    //2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>

    public static  List<Pair<String,String>> convertToUppercase(List<String> listString){
    return listString.stream()
            .map(s -> new Pair<>(s,s.toUpperCase()))
            .collect(Collectors.toList());
    }

    //3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения,
    // которые написаны в loverCase and length = 4

    public static  List<String> filterToLovercase(List<String> listString){
        return listString.stream()
                .filter(s -> s.length() ==4 && s.equals(s.toLowerCase()))
                .collect(Collectors
                 .toList());
    }


}
