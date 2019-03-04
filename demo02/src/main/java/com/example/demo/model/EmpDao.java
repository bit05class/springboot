package com.example.demo.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.entity.EmpVo;

@Mapper
public interface EmpDao {

	@Select("select * from emp")
	List<EmpVo> selectAll();

	@Select("select * from emp where empno=#{value}")
	EmpVo selectOne(int no);

	//@Update("update emp set ename=#{ename},job=#{job},mgr=#{mgr},hiredate=#{hiredate} where empno=#{empno}")
	@Update("update emp set ename=#{ename},job='ANALYST',hiredate=sysdate where empno=#{empno}")
	int updateOne(EmpVo empVo);

	@Select("select distinct job from emp")
	String[] getJobs();
}
