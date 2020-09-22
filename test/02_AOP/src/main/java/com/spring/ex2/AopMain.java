package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		
//		�α��� ����
//		��ǰ �ֹ� �ϱ�
//		DB �۾� ������
//		�α׾ƿ� ����
/*		
		Login li = new Login();
		li.login();
		
		OrderImpl myorder = new OrderImpl();
		myorder.order();
		
		Dao d = new Dao();
		d.dao();
		
		Logout lo = new Logout();
		lo.logout();
		
*/	
//	aopExam.xml
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("---- ��ǰ �ֹ��ϱ� ----");
		Order myorder = (Order)context.getBean("myorder");
		myorder.order(); // �ٽɱ��
		
		
		System.out.println("---- �Խù� ����ϱ� ----");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board(); // �ٽɱ��
//		�α��� ����
//		�ȳ��ϼ���
//		DB �۾� ������
//		�Խù� ��� �ϱ� - �ٽ�
//		�α׾ƿ� ����
		
		// �ٽ� ��� ȣ��
		
	}

}





