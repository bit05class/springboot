package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.entity.EmpVo;
import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;

	@RequestMapping("/")
	public String list(Model model){
		model.addAttribute("list", empService.list());
		return "list";
	}
	
	@RequestMapping(value="/{path}",method=RequestMethod.GET)
	public String detail(Model model,@PathVariable int path){
		model.addAttribute("jobs", empService.jobs());
		model.addAttribute("bean", empService.detail(path));
		return "edit";
	}
	@RequestMapping(value="/{path}",method=RequestMethod.PUT)
	public String edit(EmpVo empVo,@PathVariable int path){
		System.out.println(empVo);
		empService.update(empVo);
		return "redirect:"+path;
	}
}













