<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>For문으로 누적 덧셈</h1>
	<form action="<%= request.getContextPath() %>/test/forResult.jsp">
		1부터 덧셈할 숫자 입력 : <input type="text" name="number">
		<input type="submit" value="확인">
	</form>
	
</body>
</html>