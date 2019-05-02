package com.shengsiyuan.defaultmethod;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public interface MyInterFace1 {

    default void method(){
        System.out.println("myInterface1");
    }
}
