package com.example.demo.service;

import java.util.List;

import com.example.demo.model.entity.EmpVo;

public interface EmpService {

	List<EmpVo> list();

	EmpVo detail(int path);

	int update(EmpVo empVo);

	String[] jobs();

}
