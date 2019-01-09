package com.example.boot01.service;

import java.util.List;

import com.example.boot01.model.entity.EmpVo;

public interface EmpService {

	List<EmpVo> list();
	
	void insert(EmpVo bean);

	void delete(int idx);

	EmpVo detail(int idx);

	int edit(EmpVo bean);
}
