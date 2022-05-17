<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar 클래스 사용</title>
</head>
<body>
	<%
		// import 안하면 아래처럼 해야 됨
		// java.util.Calendar cal = java.util.Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
	%>
	오늘은
	<%=cal.get(Calendar.YEAR) %> 년
	<%=cal.get(Calendar.MONTH) %> 월
	<%=cal.get(Calendar.DATE) %> 일 입니다.
</body>
</html>