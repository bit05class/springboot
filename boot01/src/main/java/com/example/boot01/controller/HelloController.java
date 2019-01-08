package com.example.boot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello(ModelAndView mav) {
		mav.setViewName("hello");
		mav.addObject("msg", "환영합니다");
		return mav;
	}
}
