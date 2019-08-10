package com.wchy.demo.srv;

import com.wchy.demo.basedao.dto.Bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainDemo {

    public static void main(String[] args) {
        List<Bill> list = new ArrayList<Bill>();
        list.add(new Bill("Y", "100211", "6227111122225617", "1800", "20190720", "2000"));
        list.add(new Bill("Y", "100211", "6227111122225619", "1800", "20190720", "2000"));
        list.add(new Bill("Y", "100211", "6227111122225611", "1800", "20190720", "2000"));
        list.add(new Bill("Y", "111222", "6227111122225614", "780", "20190721", "2000"));
        list.add(new Bill("Y", "111222", "6227111122225610", "780", "20190720", "2000"));
        list.add(new Bill("Y", "111222", "6227111122225600", "780", "20190720", "2000"));
        list.add(new Bill("N", "400102", "6227111122225618", "1800", "20190720", "2000"));
        list.add(new Bill("N", "400102", "6227111122225612", "1800", "20190720", "2000"));
        list.add(new Bill("Y", "200242", "6227111122225613", "1800", "20190720", "2000"));

        list.stream().forEach(System.out :: println);


        Integer surplusAll = list.stream().mapToInt(bill -> Integer.valueOf(bill.getSurplus())).sum();

        System.out.println(surplusAll);
        System.out.println("==========>");

        Map<List<String>, Map<String, Long>> collect1 = list.stream().filter(bill -> "Y".equals(bill.getIsHousehold()))
                .collect(Collectors.groupingBy(bill -> Arrays.asList(bill.getBankId(), bill.getSurplus(), bill.getRepayAmt(), bill.getDueDate()),
                        Collectors.groupingBy(bill -> bill.getSurplus(), Collectors.counting())));

        List<Long> hah = new ArrayList<>();
        collect1.forEach((k, v) -> {
            v.forEach((surplus, count) -> {
                hah.add(Integer.valueOf(surplus) * (count - 1));
            });
        });

        int num = hah.stream().mapToInt(i -> i.intValue()).sum();

        System.out.println(surplusAll - num);



    }

}
