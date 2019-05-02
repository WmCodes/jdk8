package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author wangmeng
 * @date 2019/5/2
 * @desciption
 */
public class OptionalTest2 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee2 = new Employee();
        employee.setName("lisi");

        Company company = new Company();
        company.setName("company1");
        List<Employee> employees = Arrays.asList(employee,employee2);
        company.setEmployees(employees);

        List<Employee> list = company.getEmployees();
        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList()));

    }
}
