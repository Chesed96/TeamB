<%@page import="com.hanul.study.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
MemberDAO dao = new MemberDAO();
int succ = dao.deletMember(id);

if(succ >0){
	out.println("<script>alert('삭제성공!');");
	out.println("loction.href='jsp06.jsp'</script>");
} else{
	out.println("<script>alert('삭제실패ㅜㅠ');");
	out.println("loction.href='jsp06.jsp'</script>");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP07</title>
</head>
<body>

</body>
</html>