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
	String studentType = request.getParameter("studentType");
	String country = request.getParameter("country");
	String[] interests = request.getParameterValues("interest[]");
%>	
	입력하신 정보는 아래와 같습니다.<br>
	학력 : <%=studentType %> <br>
	소속국가 : <%=country %> <br>
	관심 분야 : 
<% 
	if (interests != null) {
		for (int i =0; i < interests.length; i++) {
%>			
			<%= interests[i] %>
<%
		}
	}
%>

</body>
</html>