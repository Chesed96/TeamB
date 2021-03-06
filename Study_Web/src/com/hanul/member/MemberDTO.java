package com.hanul.member;
package com.hanul.study;

public class MemberDTO {
	//1. 멤버변수(필드) 선언
	private String name;
	private String id;
	private	String pw;
	private int age;
	private String addr;
	private String tel;
	
	//2. 디폴트 생성자 메소드(빈깡통)
	public MemberDTO() {}

	//3.생성자 메소드 초기화
	public MemberDTO(String name, String id, String pw, int age, String addr, String tel) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
	//4. Getters & Setters 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
