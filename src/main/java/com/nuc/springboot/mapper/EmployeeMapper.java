package com.nuc.springboot.mapper;

import com.nuc.springboot.bean.Employee;

/**
 * 描述:员工
 *
 * @author 闫文强
 * @create 2018-04-29 11:18
 */


//使用@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

	public Employee getEmpById(Integer id);

	public void insertEmp(Employee employee);
}