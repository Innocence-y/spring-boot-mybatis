package com.nuc.springboot.mapper;

import com.nuc.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * 描述:部门
 *
 * @author 闫文强
 * @create 2018-04-29 10:49
 * 这是一个操作数据库的mapper
 */
//@Mapper
public interface DepartmentMapper {
	@Select("select * from department where id=#{id}")
	public Department getDeptById(Integer id);

	@Delete("delete from department where id=#{id}")
	public int deleteDeptById(Integer id);

	@Options(useGeneratedKeys = true,keyProperty = "id")
	@Insert("insert into department(department_name) values(#{departmentName})")
	public int insertDept(Department department);

	@Update("update department set department_name=#{departmentName} where id=#{id}")
	public int updateDept(Department department);
}