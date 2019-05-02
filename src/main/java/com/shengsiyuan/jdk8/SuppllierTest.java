package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class SuppllierTest {

    public static void main(String[] args) {

        //不接受参数 返回一个结果
        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
