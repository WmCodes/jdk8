package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangmeng
 * @date 2019/5/3
 * @desciption
 */
public class StreamTest11 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome","world hello","hello world hello","hello welcome");

       // list.stream().map(itm -> itm.split(" ")).distinct().collect(Collectors.toList()).forEach(System.out::println);

       // List<String> result = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

         List<String > result = list.stream().flatMap(item -> Arrays.stream(item.split(" "))).distinct().collect(Collectors.toList());

        result.forEach(System.out::println);


    }
}
