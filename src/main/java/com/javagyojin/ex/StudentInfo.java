package com.javagyojin.ex;

public class StudentInfo {

	private Student student;
	
	public StudentInfo(Student student) {//생성자 DI
		this.student = student;		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		System.out.println("학년 : " + student.getGradeNum());//학년
		System.out.println("반 : " + student.getClassNum());//반		
		
	}

	
	
	
}
