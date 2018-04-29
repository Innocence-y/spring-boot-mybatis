package com.nuc.springboot.bean;

/**
 * 描述:部门
 *
 * @author 闫文强
 * @create 2018-04-29 10:46
 */
public class Department {
	private Integer id;
	private String departmentName;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getId() {
		return id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

}