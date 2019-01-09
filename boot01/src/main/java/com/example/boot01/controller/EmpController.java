package com.example.boot01.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/add.do")
	public String add() {
		return "add";
	}
	
	@PostMapping("/add.do")
	public String insert(@ModelAttribute EmpVo bean) {
		empService.insert(bean);
		return "redirect:/list.do";
	}
	
	@DeleteMapping("/delete.do")
	public String del(int idx) {
		empService.delete(idx);
		return "redirect:/list.do";
	}
	
	@GetMapping("/detail.do/{idx}")
	public String detail(@PathVariable int idx,Model model) {
		model.addAttribute("bean", empService.detail(idx));
		return "detail";
	}
	
	@PutMapping("/detail.do/{idx}")
	public String edit(@PathVariable int idx,@ModelAttribute EmpVo bean,Model model) {
		bean.setEmpno(idx);
		System.out.println(bean);
		if(empService.edit(bean)>0) {
			model.addAttribute("bean", bean);
			return "detail";
		}else return "redirect:list.do";
	}
}
