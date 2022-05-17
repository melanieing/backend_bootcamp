<%--
에러페이지 실습을 위한 페이지.
	실습방법은 다음과 같음.
	1. 그냥 실행하여 web.xml파일에 지정된 500에러 페이지 응답 확인
	2. 아래 주석처리되어있는 에러페이지를 지정하는 페이지 디렉티브의 주석 제거 후 실행하여
	web.xml파일에 지정된 404에러페이지 응답 확인
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 아래 디렉티브를 지정하면, /error/error.jsp로 응답  
왜? 디렉티브가 web.xml 설정보다 우선함--%>
<%-- 아래 디렉티브가 없으면, web.xml 지정 error500.jsp로 응답  --%>
<%@ page errorPage="/error/error.jsp" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
	name 파라미터 값 :
	<%= request.getParameter("name").toUpperCase() %>
</body>
</html>