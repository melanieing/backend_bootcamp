<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Home</h1>
	안녕하세요, 반갑습니다!<br>
	현재 시간은 <%=new Date() %> 입니다.
	<hr>
	
	아래 링크를 선택하세요.
	<ul>
		<li><a href="Info.jsp">클라이언트 및 서버정보</a></li>
		<li><a href="Form.jsp">폼 실습 및 파라미터 요청</a></li>
		<li><a href="Header.jsp">헤더 목록 출력</a></li>
		<li><a href="Redirect.jsp">구글로 리다이렉트</a></li>
		<li><a href="PageContext.jsp">PageContext 기본 객체</a></li>
		<li><a href="Parameters.jsp">초기화 파라미터 읽어오기</a></li>
		<li><a href="ServerInfo.jsp">서버 정보 출력</a></li>
		<li><a href="BufferInfo.jsp">버퍼 정보 출력</a></li>
		<li><a href="FirstPage.jsp">첫번째 페이지 속성</a></li>
		
	</ul>
	 
</body>
</html>