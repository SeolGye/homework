<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html>
<html>
<head>
<script src="resources/js/jquery/jquery-3.5.1.js"></script>
<link href="resources/css/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/myCss.css" rel="stylesheet">
</head>
<body class="text-center backImage">


	<div class="container center">
		<div
			class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 centerMarginAuto">
			<!-- 			<div class="panel panel-success ">
 -->
			<div>
				<p style = "font-size : 2.5rem">������ �� �ý���</p>
			</div>
			<div class="card align-middle centerMarginAuto"
				style="width: 20rem; border-radius: 20px;">


				<div class="card-title" style="margin-top: 30px;">

					<c:if test="${msg != false}">
						<div class="paenl-title">�α��� �ϼ���</div>
					</c:if>

					<c:if test="${msg == false}">
						<div class="panel-heading text-danger">�α��ο� �����߽��ϴ�. ���̵� �Ǵ� �н����带 �ٽ�
							�Է����ּ���</div>
					</c:if>


				</div>
				<div class="card-body">
					<form class="login-form" role="form" method="post"
						autocomplete="off"
						action="${pageContext.request.contextPath}/login">
						<div>
							<input type="text" id="userName" name="userName"
								class="form-control" placeholder="���̵�" required autofocus />
						</div>
						<div>
							<input type="password" id="userPassword" name="userPassword"
								class="form-control" placeholder="��й�ȣ" />
						</div>
						<div>
							<button class="form-control btn btn-primary" type="submit">�α���</button>
						</div>
					</form>
					<img alt="No image"
						src="${pageContext.request.contextPath}/resources/img/logo.png">
				</div>

			</div>
			<!-- 	</div> -->
		</div>

	</div>

	<script src="resources/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
