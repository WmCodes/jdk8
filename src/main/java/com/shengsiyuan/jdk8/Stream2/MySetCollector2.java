package com.shengsiyuan.jdk8.Stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author wangmeng
 * @date 2019/5/4
 * @desciption
 */
public class MySetCollector2<T> implements Collector<T,Set<T>,Map<T,T>> {
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return (set,item) ->{
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1,set2) ->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");
        return set ->{
            Map<T,T> map = new HashMap<>();
            set.stream().forEach(item -> map.put(item,item));
            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","welcome","hello","a","b","c","d","e","f","g");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println("set:"+set);

        Map<String,String> map = set.stream().collect(new MySetCollector2<>());
        System.out.println(map);
    }
}
