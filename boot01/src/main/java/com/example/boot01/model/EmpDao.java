package com.example.boot01.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.boot01.model.entity.EmpVo;

public interface EmpDao {
	@Select("select * from emp order by empno")
	public List<EmpVo> selectAll();
}
