package com.javaex.ex02;

public class Friend {
	
	//필드
	private String name;
	private String hp;
	private String company;
	
	
	//생성자
	public Friend() {
		super();
	}
	
	public Friend(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	//메서드 gs

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return company;
	}

	public void setSchool(String company) {
		this.company = company;
	}

	
	
	//메서드 일반
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + company + "]";
	}
	
	public void showInfo() {
		System.out.println("이름: " + name +" 전화번호:" + hp + " 회사:" + company);
	}
	
}
