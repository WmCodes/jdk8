package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class Test3 {


    public static void main(String[] args) {

     /*   TheInterface t1 = ()->{};
        System.out.println(t1.getClass().getInterfaces()[0]);

        TheInterface2 t2 = ()->{};
        System.out.println(t2.getClass().getInterfaces()[0]);

        new Thread(()->{
            System.out.println("hello world");
        }).start();*/

        List<String> list = Arrays.asList("hello","world","hello world");
       // list.forEach(item -> System.out.println(item.toUpperCase()));


        List<String> list2 = new ArrayList<>();
      //  list.forEach(item -> list2.add(item.toUpperCase()));
     //   list2.forEach(item -> System.out.println(item));


      //  list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

   /*     list.stream().map(String::toUpperCase).forEach(item-> System.out.println(item));

        Function<String,String> function = String::toUpperCase;
        System.out.println(function.getClass().getInterfaces()[0]);*/


    }
}


@FunctionalInterface
interface TheInterface{
    void myMethod();
}

@FunctionalInterface
interface TheInterface2{
    void myMethod2();
}