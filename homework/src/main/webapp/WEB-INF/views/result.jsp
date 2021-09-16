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
<div class="navbar navbar-inverse navbar-fixed-top bg-primary" role="navigation">
  <div class="container">
   <div class="leftbox text-white">
      객관식 평가 시스템
   </div>
   
   <div class="rightbox text-white">
   	${user.userName} 님 환영합니다.
   	<button class="btn btn-danger"  onclick="location.href=' ${pageContext.request.contextPath}/logout ' "> 로그아웃</button>
   	
   </div>
   
   
  </div> 
 </div>

<div class="container row centerMarginAuto area1 bg-white posting-box">

<div class="container center text-center">

<h2>채점 결과</h2>
<table class="table borderless">

<thead>
<tr>
<th>항목</th>
<th>평가대상</th>
</tr>
</thead>
<tbody>

<tr>
<td>채점대상</td>
<td>${userResult.userInputCount}
</td>
</tr>

<tr>
<td>정답비율</td>
<td>${userResult.correctCount} / 10 (${userResult.correctPercent} %)
</td>
</tr>

<tr>
<td>총점</td>
<td>${userResult.totalScore}</td>
</tr>
<tr>

<td>합격여부</td>
<td>
<c:if test = "${userResult.passOrFail == true}">
<p class="text-primary">합격!!</p>
</c:if>

<c:if test = "${userResult.passOrFail != true}">
<p class="text-danger">불합격!!</p>
</c:if>

</tr>

</tbody>


</table>

<a href = "${pageContext.request.contextPath}/answerSheet">다시 제출</a>

</div>





</div>

<script src="resources/js/bootstrap/bootstrap.min.js"></script>	
</body>
</html>