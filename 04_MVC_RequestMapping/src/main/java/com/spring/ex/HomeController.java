package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
//		2020.09.21
//		2020�� 9�� 21�� ���� 5��
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//request.setAttribute("serverTime", formattedDate );
		//serverTime=2020�� 9�� 21�� ���� 5��
		
		return "home";
		
//		/WEB-INF/views/home.jsp
//		RequestDispatc~
//		dis.forward()
	}
	@RequestMapping("member/view")
	public String view() {
		System.out.println("view()");
		return "member/memberView";
		//���ϰ��� jsp�̸�! ������ �����Ѱ��־ jsp�Ƚᵵ ���� ����
	}
	@RequestMapping("a")
	public String a() {
		System.out.println("a()");
		return "b";
	}
	@RequestMapping("/member/result")
	public String result(Model model) {
		model.addAttribute("id","abc"); 
		//request.setAttribute("id", "abc ) �Ӽ������� ����! modelandview�� �Ȱ���!
		System.out.println("result()");
		return "member/result";
	}
	@RequestMapping("member/list")
	public ModelAndView list() {
		System.out.println("list()");
		ModelAndView mav =  new ModelAndView();
		mav.addObject("name","����");
		mav.addObject("pw",1147);
		mav.setViewName("member/list");
		// /WEB-INF/views/member/list.jsp
		//return "member/list";
		return mav;
	}
}
