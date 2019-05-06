package com.shengsiyuan.jdk8.Stream2;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/5/6
 * @desciption
 */
public class StreamTest3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");
        list.stream().forEach(System.out::println);
    }
}
