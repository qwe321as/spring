package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("form")
	public String form(){
		System.out.println("form()");
		return "form";
	}
	@RequestMapping("input1")
	public String input1(){
		System.out.println("input1()");
		return "music/result1";
	}
	@RequestMapping("input2")
	public String input2(Model model,@RequestParam("title") String title,@RequestParam("singer") String singer, @RequestParam("price") String price){
		System.out.println("input2()");
		System.out.println(title);
		System.out.println(singer);
		System.out.println(price);
		return "music/result2";
	}
	@RequestMapping("input3")
	public String result3(Music m){
		System.out.println("input3()");
		return "music/result3";
	}
	@RequestMapping("input4")
	public String result4(@ModelAttribute("mb") Music m){
		System.out.println("input4()");
		return "music/result4";
	}
	
}
