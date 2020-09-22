package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")
public class SampleController {
	//@RequestMapping("sample/input")
	@RequestMapping("/input")
	public String input(){
		System.out.println("input()");
		return "sample/input";
	}
	//@RequestMapping("sample/list")
	@RequestMapping("/list")
	public String list(){
		System.out.println("list()");
		return "sample/list";
	}
}
