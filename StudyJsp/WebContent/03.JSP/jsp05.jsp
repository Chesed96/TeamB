<%@ page import="com.hanul.study.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--
//MVC Project에서 학습했던 Servlet 코드(Servlet03.java) : 순수 자바 코드(POJO)
//request.setCharacterEncoding("utf-8");	//인코딩 설정
//String name = request.getParameter("name");
//String id = request.getParameter("id");
//String pw = request.getParameter("pw");
//int age = Integer.parseInt(request.getParameter("age"));
//String addr = request.getParameter("addr");
//String tel = request.getParameter("tel");
//MemberDTO dto = new MemberDTO(name, id, pw, age, addr, tel);

request.setCharacterEncoding("utf-8");	//인코딩 설정
MemberDTO dto = new MemberDTO();
dto.setName(request.getParameter("name"));
dto.setId(request.getParameter("id"));
dto.setPw(request.getParameter("pw"));
dto.setAge(Integer.parseInt(request.getParameter("age")));
dto.setAddr(request.getParameter("addr"));
dto.setTel(request.getParameter("tel"));

MemberDAO dao = new MemberDAO
dao.insertMember(dto);
--%>

<% request.setCharacterEncoding("utf-8");	//인코딩 설정 %>

<jsp:useBean id="dto" class="com.hanul.study.MemberDTO">
	<%-- <jsp:setProperty property="name" name="dto"/>
	<jsp:setProperty property="id" name="dto"/>
	<jsp:setProperty property="pw" name="dto"/>
	<jsp:setProperty property="age" name="dto"/>
	<jsp:setProperty property="addr" name="dto"/>
	<jsp:setProperty property="tel" name="dto"/> --%>
	<jsp:setProperty property="*" name="dto"/>
</jsp:useBean>

<jsp:useBean id="dao" class="com.hanul.study.MemberDAO"/>

<%
int succ = dao.insertMember(dto);
if(succ > 0){
	out.println("<script>alert('회원가입 성공!');");
	out.println("location.href='jsp05Main.html';</script>");
}else{
	out.println("<script>alert('회원가입 실패!');");
	out.println("location.href='jsp05Main.html';</script>");
}
%>
