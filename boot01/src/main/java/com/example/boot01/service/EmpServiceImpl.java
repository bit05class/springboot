package com.example.boot01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.boot01.model.EmpDao;
import com.example.boot01.model.entity.EmpVo;

@Service
public class EmpServiceImpl implements EmpService {
	@javax.inject.Inject
	EmpDao empDao;

	@Override
	public List<EmpVo> list() {
		
		return empDao.selectAll();
	}

	@Override
	public void insert(EmpVo bean) {
		empDao.insertOne(bean);
	}

	@Override
	public void delete(int idx) {
		empDao.delOne(idx);
	}
}
