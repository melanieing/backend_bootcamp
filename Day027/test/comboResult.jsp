<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String engine = request.getParameter("engine");
	
	if (engine.equals("google")) {
		response.sendRedirect("https://www.google.com");
	} else if (engine.equals("naver")) {
		response.sendRedirect("https://www.naver.com");
	} else if (engine.equals("daum")) {
		response.sendRedirect("https://www.daum.net");
	}
%>
