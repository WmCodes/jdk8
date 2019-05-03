package com.shengsiyuan.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StreamTest4 {

    public static void main(String[] args) {
 /*       Stream<String> stream = Stream.of("hello","world","hello world");
        //String[] strings = stream.toArray(length->new String[length]);
        String[] strings = stream.toArray(String[]::new);
        Arrays.asList(strings).forEach(System.out::println);*/

      //  Stream<String> stream = Stream.of("hello","world","hello world");
      //List<String> list = stream.collect(Collectors.toList());
/*        List<String>  list = stream.collect(()->new ArrayList(),(theList, item)->theList.add(item),
                (thelist1,thelist2)->thelist1.addAll(thelist2));*/

     //   List<String> list = stream.collect(LinkedList::new,LinkedList::add,LinkedList::addAll);
       // list.forEach(System.out::println);


      /* Stream<String> stream = Stream.of("hello","world","hello world");
        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
        list.forEach(System.out::println);*/
/*
        Stream<String> stream = Stream.of("hello","world","hello world");
        Set<String>  set= stream.collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);*/

        Stream<String> stream = Stream.of("hello","world","hello world");
        String str = stream.collect(Collectors.joining()).toString();



    }
}
