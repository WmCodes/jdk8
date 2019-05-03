package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StreamTest1 {

    public static void main(String[] args) {

        Stream stream = Stream.of("hello","world","hello world");

        String[] myArray = new String[]{"hello","world","hello world"};
        Stream stream1 = Stream.of(myArray);
        Stream stream2 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream3 = list.stream();
    }
}
