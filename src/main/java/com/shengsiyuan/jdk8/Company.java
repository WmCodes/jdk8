package com.shengsiyuan.jdk8;

import java.util.List;
import java.util.Optional;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class Company {

    private String name;
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void Test(Optional optional){

    }
}
