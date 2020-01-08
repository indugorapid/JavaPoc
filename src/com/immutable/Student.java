package com.immutable;

public final class Student {
   
	final int reg_no;
	final String name;
	
	public Student(int reg_no, String name) {
		this.reg_no = reg_no;
		this.name = name;
	}

	public  int getReg_no() {
		return reg_no;
	}

	public  String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Student s = new Student(101, "ABC");
		System.out.println(s.getReg_no());
		System.out.println(s.getName());
	}
}


