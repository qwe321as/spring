package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	// person/input¿äÃ» => person/result.jsp 
	// http://localhost:8080/ex/person/input?name=kim&age=23
	@RequestMapping("person/input")
	public String input(HttpServletRequest request, Model model) { // new HttpServletRequest()
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name : " + name); // kim
		System.out.println("age : " + age); // 23
		
		model.addAttribute("name", name+"¾¾~"); // name=kim¾¾~
		model.addAttribute("age", age+"»ì~");  // age=23»ì
		
		return "person/result";
	}
	
	@RequestMapping("form")
	public String form() {
		return "person/personInput";
	}
	
	@RequestMapping(value = "person/join1"/* , method=RequestMethod.POST */)
	public String join1(HttpServletRequest request,Model model) {
		System.out.println("join1()");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		model.addAttribute("Mname", name+"´Ô~");
		
		return "person/personView1";
	}
	
}















