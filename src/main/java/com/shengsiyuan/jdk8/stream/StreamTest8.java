package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StreamTest8 {

    public static void main(String[] args) {
        //IntStream.iterate(0,i->(i+1)%2).distinct().limit(6).forEach(System.out::println);

        IntStream.iterate(0, i->(i+1)%2).limit(6).distinct().forEach(System.out::println);


    }
}
