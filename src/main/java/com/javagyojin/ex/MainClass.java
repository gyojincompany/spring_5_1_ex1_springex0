package com.javagyojin.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		
		studentInfo.getStudentInfo();//È«±æµ¿
		
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		
		studentInfo.getStudentInfo();//±èÀ¯½Å
		
		ctx.close();
		
	}

}
