package com.hanul.study;

<<<<<<< HEAD
import java.io.Serializable;

public class MemberDTO implements Serializable{	//직렬화
	//① 멤버변수(필드) 선언
	private String name;
	private String id;
	private String pw;
=======
public class MemberDTO {
	//1. 멤버변수(필드) 선언
	private String name;
	private String id;
	private	String pw;
>>>>>>> JHU
	private int age;
	private String addr;
	private String tel;
	
<<<<<<< HEAD
	//② 디폴트 생성자 메소드(빈깡통)
	public MemberDTO() {}

	//③ 생성자 메소드 초기화
=======
	//2. 디폴트 생성자 메소드(빈깡통)
	public MemberDTO() {}

	//3.생성자 메소드 초기화
>>>>>>> JHU
	public MemberDTO(String name, String id, String pw, int age, String addr, String tel) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
<<<<<<< HEAD

	//④ Getters & Setters 메소드
=======
	
	//4. Getters & Setters 메소드
>>>>>>> JHU
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
	
<<<<<<< HEAD
=======
	
	
>>>>>>> JHU
}
