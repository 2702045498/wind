package com.bange.dao;

import com.bange.entity.Department;
import com.bange.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;


    static {
        employees = new HashMap<>();
        employees.put(1001, new Employee(1001, "E-AA", "123456@qq.com", 0, new Department(101, "D-AA"), getBirthDay("2022-01-02")));
        employees.put(1002, new Employee(1002, "E-BB", "1234567@qq.com", 1, new Department(102, "D-BB"), getBirthDay("2022-01-05")));
        employees.put(1003, new Employee(1003, "E-CC", "1234568@qq.com", 1, new Department(103, "D-CC"), getBirthDay("2022-01-06")));
        employees.put(1004, new Employee(1004, "E-DD", "1234569@qq.com", 1, new Department(104, "D-DD"), getBirthDay("2022-01-07")));
        employees.put(1005, new Employee(1005, "E-EE", "1234570@qq.com", 0, new Department(105, "D-EE"), getBirthDay("2022-01-08")));
    }
    private static  Integer initId=1006;
    @Autowired
    DepartmentDao departmentDao;

    public void save(Employee employee) {
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }


    public static Date getBirthDay(String formDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(formDate);
        } catch (ParseException e) {
            date = new Date();
        }
        return date;
    }
}
