package com.shengsiyuan.jdk8;

import java.util.function.Predicate;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> predicate = p -> p.length()> 5;
        System.out.println(predicate.test("hello"));
    }
}
