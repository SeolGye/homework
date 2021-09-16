<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table> 
	
	<tr><th>번호</th> <th>이름</th> <th>비밀번호</th> <th>입력값</th> </tr>
	
	<c:forEach items = "${list}" var = "user"> 
	<tr>
		<td>${user.userId}</td> 
		<td>${user.userName}</td>
		<td>${user.userPassword}</td>
		<td>${user.userAnswer}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>