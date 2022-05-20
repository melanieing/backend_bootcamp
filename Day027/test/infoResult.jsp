<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A 페이지</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String intro = request.getParameter("introduction").replace("\r\n", "<br>");
%>	
	입력하신 정보는 아래와 같습니다.<br>
	ID : <%=id %> <br>
	Password : <%=pwd %> <br>
	자기 소개 : <%=intro %>
	
</body>
</html>