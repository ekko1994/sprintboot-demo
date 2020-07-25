package com.zh.crud.controller;

import com.zh.crud.dao.DepartmentDao;
import com.zh.crud.dao.EmployeeDao;
import com.zh.crud.entities.Department;
import com.zh.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/10 - 16:47
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String emps(Map<String, Object> map){
        Collection<Employee> emps = employeeDao.getAll();
        map.put("emps", emps);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Map<String, Object> map){
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts", depts);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println("employee====>"+employee);
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Map<String, Object> map){
        Employee employee = employeeDao.get(id);
        map.put("emp", employee);

        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts", depts);

        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delEmp(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
