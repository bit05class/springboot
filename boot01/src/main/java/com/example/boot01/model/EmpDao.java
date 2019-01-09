package com.example.boot01.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.example.boot01.model.entity.EmpVo;

public interface EmpDao {
	@Select("select * from emp order by empno")
	public List<EmpVo> selectAll();
	
	@Insert("insert into emp (empno,ename,sal,deptno) values (#{empno},#{ename},#{sal},#{deptno})")
	public void insertOne(EmpVo bean);

	@Delete("delete from emp where empno=#{idx}")
	public void delOne(int idx);
}
