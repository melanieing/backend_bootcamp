<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/test/selectResult.jsp" method=post>
	<p>
	학력
	<select name="studentType">
		<option value="재학생">재학생</option>
		<option value="휴학생">휴학생</option>
		<option value="졸업생">졸업생</option>
	</select>
	</p>
	소속 국가
	<select name="country">
		<option value="대한민국">대한민국</option>
		<option value="미국">미국</option>
		<option value="일본">일본</option>
	</select>
	<br><br>
	관심 분야
	<select name="interest[]" multiple>
		<option value="컨설팅">컨설팅</option>
		<option value="프로듀서">프로듀서</option>
		<option value="프로그래머">프로그래머</option>
		<option value="서버관리자">서버관리자</option>
	</select>
	<br><br>
	<input type="submit" value="이동">
	<input type="reset" value="초기화">
	</form>
</body>
</html>