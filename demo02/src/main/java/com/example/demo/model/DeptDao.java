package com.example.demo.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.entity.DeptVo;

@Mapper
public interface DeptDao {

	@Select("select deptno from dept")
	public List<DeptVo> selectAll();
}
