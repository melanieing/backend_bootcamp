<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.setStatus(HttpServletResponse.SC_OK);
%>

<html>
<head>
<title>404 에러 발생</title>
</head>
<body>
	<b>요청한 페이지는 존재하지 않아유</b><br></br>
	by web.xml이 지정한 기본 에러페이지 : Ex09_error404.jsp
</body>
</html>