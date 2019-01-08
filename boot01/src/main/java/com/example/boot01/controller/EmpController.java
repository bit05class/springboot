package com.example.boot01.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.boot01.model.entity.EmpVo;
import com.example.boot01.service.EmpService;

@Controller
public class EmpController {

	@Inject
	EmpService empService;
	
	@RequestMapping("/list.do")
	public ModelAndView list(ModelAndView mav) {
		mav.addObject("alist", empService.list());
		mav.setViewName("list");
		return mav;
	}
}
