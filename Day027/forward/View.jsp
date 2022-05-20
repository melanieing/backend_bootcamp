<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String code = request.getParameter("code");
	String viewPageURI = null;
	
	if (code.equals("A")) {
		viewPageURI = "/forward/viewModule/a.jsp";
	} else if (code.equals("B")) {
		viewPageURI = "/forward/viewModule/b.jsp";
	} else if (code.equals("C")) {
		viewPageURI = "/forward/viewModule/c.jsp";
	}
%>
<jsp:forward page="<%= viewPageURI %>"/>
