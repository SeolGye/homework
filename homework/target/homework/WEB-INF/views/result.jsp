<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

${userResult.userInputCount}
${userResult.correctCount}
${userResult.correctPercent}
${userResult.totalScore}
${userResult.passOrFail}

<a href = "${pageContext.request.contextPath}/answerSheet">다시 제출</a>

</body>
</html>