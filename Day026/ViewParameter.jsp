<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력</title>
</head>
<body>
	<h4>request.getParameter() 메서드 사용</h4>
	name 파라미터 = <%=request.getParameter("name") %> <br>
	address 파라미터 = <%=request.getParameter("address") %><br>
	
	<h4>request.getParameterValues() 메서드 사용</h4>
	
	<%
		String[] values = request.getParameterValues("pet");
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
	%>			
			<%=values[i] %>
	<%
			}
		}
	%>
	<br>
	
	<h4>request.getParameterNames() 메서드 사용</h4>
	<%
		Enumeration<String> enumData = request.getParameterNames();
		while(enumData.hasMoreElements()) {
			String name = (String)enumData.nextElement();
	%>
			<%=name %>
	<%
		}
	%>
	<br>
	
	<h4>request.getParameterMap() 메서드 사용</h4>
	<%
		Map<String, String[]> parameterMap = request.getParameterMap();
		String[] nameParam = (String[])parameterMap.get("name");
		if (nameParam != null) {
	%>
			name = <%=nameParam[0] %>
	<%
		}
	%>
</body>
</html>