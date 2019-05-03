package com.shengsiyuan.jdk8.defaultmethod;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class MyClass implements MyInterFace1,MyInterface2 {

    @Override
    public void method() {
        MyInterface2.super.method();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();
    }

}
