package com.shengsiyuan.jdk8;

import java.util.function.Function;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(1,value ->{return 2*value;}));
        System.out.println(test.compute(2,value -> 5+value));
        System.out.println(test.convert(5,value ->String.valueOf(value+"hellowrd")));

    }

    public int compute(int a, Function<Integer,Integer>function){
        int result = function.apply(a);
        return  result;
    }

    public String convert(int a ,Function<Integer,String> function){
        return  function.apply(a);
    }



    public int method1(int a ){
        return 2*3;
    }

}
