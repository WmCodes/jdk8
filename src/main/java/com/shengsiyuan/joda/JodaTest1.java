package com.shengsiyuan.joda;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;


/**
 * @author wangmeng
 * @date 2019/5/6
 * @desciption
 */
public class JodaTest1 {

    public static void main(String[] args) {
        IntList intList = new ArrayIntList();
        intList.add(1);
        intList.add(2);

        intList.forEach(System.out::println);
    }
}
