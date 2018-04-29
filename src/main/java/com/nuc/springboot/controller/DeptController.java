package com.nuc.springboot.controller;

import com.nuc.springboot.bean.Department;
import com.nuc.springboot.bean.Employee;
import com.nuc.springboot.mapper.DepartmentMapper;
import com.nuc.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:部门
 *
 * @author 闫文强
 * @create 2018-04-29 10:59
 */
@RestController
public class DeptController {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	DepartmentMapper departmentMapper;

	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable("id") Integer id){
		return  departmentMapper.getDeptById(id);
	}

	@GetMapping("/dept")
	public Department insertDept(Department department){
		departmentMapper.insertDept(department);
		return department;
	}

	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id){
		return  employeeMapper.getEmpById(id);
	}
}