package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.EmpDao;
import com.example.demo.model.entity.EmpVo;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	@Resource
	EmpDao empDao;

	@Transactional(readOnly=true)
	public List<EmpVo> list(){
		return empDao.selectAll();
	}

	@Override
	public EmpVo detail(int no) {
		return empDao.selectOne(no);
	}
	
	@Override
	public String[] jobs() {
		return empDao.getJobs();
	}

	@Override
	public int update(EmpVo empVo) {
		return empDao.updateOne(empVo);
	}
}
