<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int number = Integer.parseInt(request.getParameter("number"));
			
	%>
	
	<h1>계산 결과</h1>
	<%
		int sum = 0;
		for (int i = 1; i <= number; i++) {
	%>
			<%= i %>
	<%
			if (i != number) {
	%>
			+
	<%
			}
			sum += i;
		}	
	%>
		=
		<%=sum %>
</body>
</html>