package com.shengsiyuan.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier){
        return supplier.get() +"test";
    }

    public String getString2(String str,Function<String,String> function){
        return function.apply(str);
    }


    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",10);
        Student student2 = new Student("lisi",90);
        Student student3 = new Student("wangwu",50);
        Student student4 = new Student("zhaoliu",40);

        List<Student> students = Arrays.asList(student1,student2,student3,student4);

       // students.sort((studentParam1,studentParam2)->Student.compareStudentByScore(studentParam1,studentParam2));
       /* students.forEach( student -> System.out.println(student.getScore()));

        System.out.println("---------------");

        students.sort(Student::compareStudentByScore);
        students.forEach(student -> System.out.println(student.getScore()));*/

     /*  StudentComparator studentComparator = new StudentComparator();

       students.sort(studentComparator::compareStudentByScor);
       students.forEach(student -> System.out.println(student.getScore()));*/

     /*students.sort(Student::compareByScore);
     students.forEach(student -> System.out.println(student.getScore()));
*/

     List<String> cities = Arrays.asList("qingdao","chongqing","tianjing","beijing");

/*        Collections.sort(cities,(city1,citye2)->city1.compareToIgnoreCase(citye2));
        cities.forEach(city -> System.out.println(city));*/

     /*   Collections.sort(cities,String::compareToIgnoreCase);
        cities.forEach(System.out::println);*/

     MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
     System.out.println(methodReferenceTest.getString(String::new));

     System.out.println(methodReferenceTest.getString2("hello",String::new));

    }
}
