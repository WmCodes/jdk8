package com.shengsiyuan.jdk8.methodreference;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class StudentComparator {

    public int compareStudentByScor(Student student1,Student student2){
        return student1.getScore() -student2.getScore();
    }

    public int compareStudentByName(Student student1,Student student2){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
