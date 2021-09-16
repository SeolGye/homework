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
<body class ="backImage">

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
	<div class="col-sm-6 area2 ">
	
		<img class = "image-box" alt="No image"
						src="${pageContext.request.contextPath}/resources/img/testImage.jpg">
	
	</div>
	
	<div class="col-sm-6 area2">
  		<p class="text-center">���� ���</p>
		<hr>
	<form action = "${pageContext.request.contextPath}/result" method = "post">
	<ul>
		<li>���� 1 : 
		<input type="radio" name="q1" value = "1">1
		<input type="radio" name="q1" value = "2">2
		<input type="radio" name="q1" value = "3">3
		<input type="radio" name="q1" value = "4">4
		<input type="radio" name="q1" value = "5">5
		</li>
		
		<li>���� 2 : 
		<input type="radio" name="q2" value = "1">1
		<input type="radio" name="q2" value = "2">2
		<input type="radio" name="q2" value = "3">3
		<input type="radio" name="q2" value = "4">4
		<input type="radio" name="q2" value = "5">5
		</li>
		
		<li>���� 3 : 
		<input type="radio" name="q3" value = "1">1
		<input type="radio" name="q3" value = "2">2
		<input type="radio" name="q3" value = "3">3
		<input type="radio" name="q3" value = "4">4
		<input type="radio" name="q3" value = "5">5
		</li>
		<li>���� 4 : 
		<input type="radio" name="q4" value = "1">1
		<input type="radio" name="q4" value = "2">2
		<input type="radio" name="q4" value = "3">3
		<input type="radio" name="q4" value = "4">4
		<input type="radio" name="q4" value = "5">5
		</li>
		<li>���� 5 : 
		<input type="radio" name="q5" value = "1">1
		<input type="radio" name="q5" value = "2">2
		<input type="radio" name="q5" value = "3">3
		<input type="radio" name="q5" value = "4">4
		<input type="radio" name="q5" value = "5">5
		</li>
		<li>���� 6 : 
		<input type="radio" name="q6" value = "1">1
		<input type="radio" name="q6" value = "2">2
		<input type="radio" name="q6" value = "3">3
		<input type="radio" name="q6" value = "4">4
		<input type="radio" name="q6" value = "5">5
		</li>
		<li>���� 7 : 
		<input type="radio" name="q7" value = "1">1
		<input type="radio" name="q7" value = "2">2
		<input type="radio" name="q7" value = "3">3
		<input type="radio" name="q7" value = "4">4
		<input type="radio" name="q7" value = "5">5
		</li>
		<li>���� 8 : 
		<input type="radio" name="q8" value = "1">1
		<input type="radio" name="q8" value = "2">2
		<input type="radio" name="q8" value = "3">3
		<input type="radio" name="q8" value = "4">4
		<input type="radio" name="q8" value = "5">5
		</li>
		<li>���� 9 : 
		<input type="radio" name="q9" value = "1">1
		<input type="radio" name="q9" value = "2">2
		<input type="radio" name="q9" value = "3">3
		<input type="radio" name="q9" value = "4">4
		<input type="radio" name="q9" value = "5">5
		</li>
		<li>���� 10 : 
		<input type="radio" name="q10" value = "1">1
		<input type="radio" name="q10" value = "2">2
		<input type="radio" name="q10" value = "3">3
		<input type="radio" name="q10" value = "4">4
		<input type="radio" name="q10" value = "5">5
		</li>
				
	</ul>
		<button class="form-control btn btn-primary bottom " type="submit">���Ȯ��</button>
	</form>
	</div>	
	
<div class="container">
  <div class="leftbox">
		<p>copyright by 323cns</p>
	</div>
	<div class="rightbox">
		<p>copyright by 323cns</p>
	</div>	
	</div>
	

 </div>
	
<script src="resources/js/bootstrap/bootstrap.min.js"></script>	
</body>
</html>