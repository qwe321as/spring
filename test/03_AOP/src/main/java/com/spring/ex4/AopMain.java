package com.spring.ex4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
/*
		StudentImpl student = new StudentImpl();
		student.setName("������");
		student.setAge(10);
		student.setGradeNum(3);
		student.setClassNum(5);
		
		student.getStudentInfo(); // �ٽɱ��
*/	
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		Student student = (Student)ctx.getBean("student");
		student.getStudentInfo();
	
		System.out.println("============");
		
		Worker worker = (Worker)ctx.getBean("worker");
		worker.getWorkerInfo();
	}

}

//Hello
//����մϴ�.
//�ȳ��ϼ���
//�̸� : ������
//���� : 10
//�г� : 3
//�� : 5
//����մϴ�.
//=================
//����մϴ�.
//�̸� : ����
//���� : 35
//���� : ������
//�ȳ��� �輼��
//����մϴ�.

/*20��*/




