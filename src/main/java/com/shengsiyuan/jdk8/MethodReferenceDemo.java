package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption 方法引用
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","hello world");

        list.forEach(item -> System.out.println(item));

        list.forEach(System.out::println);
    }
}
