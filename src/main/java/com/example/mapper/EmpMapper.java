package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Dept;
import com.example.domain.Emp;


@Mapper
public interface EmpMapper {

	@Select("select * from emp")
	public List<Emp> selectAll();

}
