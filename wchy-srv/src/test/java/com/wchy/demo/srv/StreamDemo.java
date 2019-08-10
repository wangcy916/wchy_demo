package com.wchy.demo.srv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("14");
        list.add("-7");
        list.add("");
        list.add("56");
        list.add("3");
        list.add("");
        list.add("14");

        List<String> collect = list.stream().filter(str -> !str.isEmpty()).sorted((str1, str2) -> (Integer.valueOf(str1) > Integer.valueOf(str2) ? 1 : -1)).collect(Collectors.toList());


        System.out.println(collect);


        List<Integer> collect1 = list.stream().filter(str -> !str.isEmpty()).map(str -> Integer.valueOf(str) + 2).distinct().collect(Collectors.toList());

        System.out.println(collect1);


        list.stream().filter(str -> !str.isEmpty()).distinct().forEach(System.out :: println);


    }

}
