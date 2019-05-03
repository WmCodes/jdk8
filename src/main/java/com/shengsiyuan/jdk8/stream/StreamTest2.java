package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StreamTest2 {

    public static void main(String[] args) {
        IntStream.of(new int[]{5,6,7}).forEach(System.out::println);

        System.out.println("==========================");

        //包含3，不包含8
        IntStream.range(3,8).forEach(System.out::println);
        System.out.println("================");

        IntStream.rangeClosed(3,8).forEach(System.out::println);
    }
}
