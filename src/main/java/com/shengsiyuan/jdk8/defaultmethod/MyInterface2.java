package com.shengsiyuan.jdk8.defaultmethod;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public interface MyInterface2 {

    default void method(){
        System.out.println("myInterface2");
    }
}
