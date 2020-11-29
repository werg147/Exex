package com.javaex.exex01;

public class Exex01 {
	// Practice05 7번문제
	
	//필드
	private String name;
	private String hp;
	private String school;
	
	//생성자 (기본-생략)
	
	//메소드(겟.셋)
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
	//메소드(일반)
	
	public void showInfo() {
		System.out.println("이름:" + name + "\t핸드폰:" + hp + "\t학교:" + school);
	}

	@Override
	public String toString() {
		return "Exex01 [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
	
	
}
