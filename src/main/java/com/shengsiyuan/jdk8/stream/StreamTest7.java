package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StreamTest7 {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("hello", "world", "hello world");
        //list.stream().map(item -> item.substring(0,1).toUpperCase()+item.substring(1)).forEach(System.out::println);

        list.stream().map(item->{
            String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);






    }

}
