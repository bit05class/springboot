package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.EmpVo;
import com.example.demo.service.EmpService;
import com.example.demo.service.EmpServiceImpl;

@RestController
@RequestMapping("/html/")
public class EmpRestController {
	@Autowired
	EmpService empService;

	@RequestMapping("list")
	public List<EmpVo> list(){
		
		return empService.list();
	}
}
