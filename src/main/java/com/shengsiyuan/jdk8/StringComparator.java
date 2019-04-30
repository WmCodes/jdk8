package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class StringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu","zhaaoliu");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(names);

    Collections.sort(names,(o1, o2) ->
        o2.compareTo(o1)
    );
        System.out.println(names);
    }
}
