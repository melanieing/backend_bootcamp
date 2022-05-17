<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP_File</title>
</head>
<body>
	<h2>JSP script 예제</h2>
	<% // Scriptlet : 자바 코드가 들어가는 곳(연산, 처리)
	String scriptlet = "스크립틀릿입니다.";
	String comment = "주석문입니다.";
	out.println("내장(기본)객체를 이용한 출력 : " + declaration + "<br><br>");
	%>
	
	<!-- Expression : 표현식 -->
	선언문 출력하기 : <%=declaration %><br><br>
	선언문 출력하기 : <%=declarationMethod()%><br><br>
	스크립틀릿 출력하기 : <%=scriptlet %><br><br>
	
	<!--  JSP에서 사용하는 HTML주석문  -->
	<!-- <%=comment%> -->
	
	<%
		// 자바주석
		/*
		자바 범위 주석
		*/
	%>
	
	<%!
	// Declaration : 선언문
	String declaration = "선언문입니다."; // 필드(뺜수) 선언
	
	public String declarationMethod() { // 메서드(함수) 선언
		return declaration;
	}
	%>
</body>
</html>