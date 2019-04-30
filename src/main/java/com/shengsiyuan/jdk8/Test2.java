package com.shengsiyuan.jdk8;

/**
 * @author wangmeng
 * @date 2019/4/16
 * @desciption
 */
public class Test2 {
        public void myTest(MyInterface myInterface){
            System.out.println("1");
            myInterface.test();
            System.out.println("2");
        }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(new MyInterface() {
            @Override
            public void test() {
                System.out.println("mytest");
            }
        });


        System.out.println("------------------");

    }

}

@FunctionalInterface
interface MyInterface{

    void test();

    @Override
    String toString();
}