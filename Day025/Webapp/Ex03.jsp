<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! // 선언문
	// 선언된 numOne 필드는 객체멤버필드이므로 톰캣이 한 번 메모리에 올리면 계속 유지
	private int numOne = 0;
	
	public void jspInit() { // 오버라이딩
		System.out.println("jspInit() 호출됨!");
	}
	public void jspDestroy() { // 오버라이딩
		System.out.println("jspDestroy() 호출됨!");
	}
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Life Cycle</title>
</head>
<body>
	<%
	// numTwo 필드는 service() 메서드 내에 선언되므로 요청 시마다 초기화
	int numTwo = 0;
	numOne++; // 새로고침 시마다 증가
	numTwo++; // 새로그침 할 때마다 초기화
	%>
	<ul>
		<li>Number One : <%=numOne %></li>
		<li>Number Two : <%=numTwo %></li>
	</ul>
</body>
</html>