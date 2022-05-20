<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션 선택 화면</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/test/infoResult.jsp" method="post">
	<p>
		ID : <input type="text" name="id" placeholder="id">
	</p>
	<p>
		Password : <input type="password" name="pwd" placeholder="pwd">
	</p>
	<p>
		자기소개 : <br>
		<textarea name="introduction" cols="30" rows="5"></textarea>
	</p>
	<input type="submit" value="이동">
	<input type="reset" value="초기화">
	</form>
</body>
</html>
