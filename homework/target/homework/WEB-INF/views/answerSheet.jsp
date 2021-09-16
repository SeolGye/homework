<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="resources/js/jquery/jquery-3.5.1.js"></script>
<link href="resources/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/myCss.css" rel="stylesheet">
</head>
<body>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
   <div class="leftbox">
      객관식 평가 시스템
   </div>
   
   <div class="rightbox">
   	${user.userName} 님 환영합니다.
   	<button class="btn btn-danger"  onclick="location.href=' ${pageContext.request.contextPath}/logout ' "> 로그아웃</button>
   	
   </div>
   
   
  </div> 
 </div>
<div class="container row centerMarginAuto area1">
	<div class="col-sm-6 ">
	
	
	</div>
	
	<div class="col-sm-6 ">
  		<p>문제 목록</p>
		<hr>
	<form action = "${pageContext.request.contextPath}/result" method = "post">
	<ul>
		<li>문제 : 
		<input type="radio" name="q1" value = "1">1
		<input type="radio" name="q1" value = "2">2
		<input type="radio" name="q1" value = "3">3
		<input type="radio" name="q1" value = "4">4
		<input type="radio" name="q1" value = "5">5
		</li>
		
		<li>문제 : 
		<input type="radio" name="q2" value = "1">1
		<input type="radio" name="q2" value = "2">2
		<input type="radio" name="q2" value = "3">3
		<input type="radio" name="q2" value = "4">4
		<input type="radio" name="q2" value = "5">5
		</li>
		
		<li>문제 : 
		<input type="radio" name="q3" value = "1">1
		<input type="radio" name="q3" value = "2">2
		<input type="radio" name="q3" value = "3">3
		<input type="radio" name="q3" value = "4">4
		<input type="radio" name="q3" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q4" value = "1">1
		<input type="radio" name="q4" value = "2">2
		<input type="radio" name="q4" value = "3">3
		<input type="radio" name="q4" value = "4">4
		<input type="radio" name="q4" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q5" value = "1">1
		<input type="radio" name="q5" value = "2">2
		<input type="radio" name="q5" value = "3">3
		<input type="radio" name="q5" value = "4">4
		<input type="radio" name="q5" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q6" value = "1">1
		<input type="radio" name="q6" value = "2">2
		<input type="radio" name="q6" value = "3">3
		<input type="radio" name="q6" value = "4">4
		<input type="radio" name="q6" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q7" value = "1">1
		<input type="radio" name="q7" value = "2">2
		<input type="radio" name="q7" value = "3">3
		<input type="radio" name="q7" value = "4">4
		<input type="radio" name="q7" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q8" value = "1">1
		<input type="radio" name="q8" value = "2">2
		<input type="radio" name="q8" value = "3">3
		<input type="radio" name="q8" value = "4">4
		<input type="radio" name="q8" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q9" value = "1">1
		<input type="radio" name="q9" value = "2">2
		<input type="radio" name="q9" value = "3">3
		<input type="radio" name="q9" value = "4">4
		<input type="radio" name="q9" value = "5">5
		</li>
		<li>문제 : 
		<input type="radio" name="q10" value = "1">1
		<input type="radio" name="q10" value = "2">2
		<input type="radio" name="q10" value = "3">3
		<input type="radio" name="q10" value = "4">4
		<input type="radio" name="q10" value = "5">5
		</li>
				
	</ul>
	<input type="submit" value = "결과확인">	
	</form>
	</div>	
	
	<div class="container">
  <div class="leftbox">
		<p>323cns</p>
	</div>
	<div class="rightbox">
		<p>323cns</p>
	</div>	
	
	</div>
	

 </div>

<script src="resources/js/bootstrap/bootstrap.min.js"></script>	
</body>
</html>