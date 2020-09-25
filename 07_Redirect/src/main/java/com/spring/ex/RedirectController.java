package com.spring.ex;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	
	//a1��û => a1.jsp
	@RequestMapping("a1")
	public String a1(HttpServletRequest request, Model model) {
		
		System.out.println("a1 ��û");
		
		model.addAttribute("model_attr", "model_attr"); // model_attr=model_attr
		request.setAttribute("req_attr", "req_attr"); // req_attr=req_attr
		//return "a2";
		return "redirect:/a2";
		// /WEB-INF\views\a2.jsp
	}
	
	@RequestMapping("a2")
	public String a2() {
		System.out.println("a2 ��û");
		return "a3";
	}
	/////////////////////////////////////////
	
	@RequestMapping("b1")
	public String b1( RedirectAttributes redirectAttributes) {
		System.out.println("b1 ��û");
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("model_attr", "model_attr");
		map.put("req_attr", "req_attr");
		
		redirectAttributes.addFlashAttribute("map1", map);
		
		//return "b2";
		return "redirect:/b2";
	}
	
	@RequestMapping("b2")
	public String b2() {
		System.out.println("b2 ��û");
		return "b3"; // b3.jsp
	}
	
}









