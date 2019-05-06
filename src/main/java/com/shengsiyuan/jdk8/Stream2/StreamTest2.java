package com.shengsiyuan.jdk8.Stream2;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/5/5
 * @desciption
 */
public class StreamTest2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.stream().onClose(()->{
            System.out.println("aaaa");
        }).onClose(()->{
            System.out.println("bbbb");
        }).forEach(System.out::println);


    }
}
