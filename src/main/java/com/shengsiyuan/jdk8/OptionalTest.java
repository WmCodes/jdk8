package com.shengsiyuan.jdk8;

import java.util.Optional;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        if (optional.isPresent()){
            System.out.println(optional.get());
        }

        optional.ifPresent(item -> System.out.println(item));

        System.out.println("---------------");
        System.out.println(optional.orElse("world"));

        System.out.println(optional.orElseGet(()->"nihao"));
    }
}
