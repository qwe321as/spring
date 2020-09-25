package com.spring.ex;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value="form" ,method=RequestMethod.GET) // url �Է�
	public String form() {
		return "form";
	}
	
	@RequestMapping(value="form",method=RequestMethod.POST ) // type="submit"  
	public String form(HttpServletRequest request, 
						@ModelAttribute("stu") @Valid Student st, 
						BindingResult result) { 
		// command ��ü
		// �ܼ� ���
		/*
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		
		Student st = new Student();
		st.setName(name);
		st.setId(id);
		*/
		System.out.println(st.getName());
		System.out.println(st.getId());
		
		String page = "result";
		
		System.out.println("result.hasErrors():"+result.hasErrors());
		//false : ������ ���� �� 
		//true : ������ ���� ��
		
		if(result.hasErrors()) {
			page = "form";
		}
		return page;
	}
}







