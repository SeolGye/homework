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
      ������ �� �ý���
   </div>
   
   <div class="rightbox text-white">
   	${user.userName} �� ȯ���մϴ�.
   	<button class="btn btn-danger"  onclick="location.href=' ${pageContext.request.contextPath}/logout ' "> �α׾ƿ�</button>
   	
   </div>
   
   
  </div> 
 </div>

<div class="container row centerMarginAuto area1 bg-white posting-box">

<div class="container center text-center">

<h2>ä�� ���</h2>
<table class="table borderless">

<thead>
<tr>
<th>�׸�</th>
<th>�򰡴��</th>
</tr>
</thead>
<tbody>

<tr>
<td>ä�����</td>
<td>${userResult.userInputCount}
</td>
</tr>

<tr>
<td>�������</td>
<td>${userResult.correctCount} / 10 (${userResult.correctPercent} %)
</td>
</tr>

<tr>
<td>����</td>
<td>${userResult.totalScore}</td>
</tr>
<tr>

<td>�հݿ���</td>
<td>
<c:if test = "${userResult.passOrFail == true}">
<p class="text-primary">�հ�!!</p>
</c:if>

<c:if test = "${userResult.passOrFail != true}">
<p class="text-danger">���հ�!!</p>
</c:if>

</tr>

</tbody>


</table>

<a href = "${pageContext.request.contextPath}/answerSheet">�ٽ� ����</a>

</div>





</div>

<script src="resources/js/bootstrap/bootstrap.min.js"></script>	
</body>
</html>