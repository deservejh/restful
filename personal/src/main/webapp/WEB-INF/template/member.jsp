<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>멤버</title>
</head>
<body>
	<h2>Hello!</h2>
	<div>JSP List Test</div>
	<c:forEach var="item" items="${list }">
		${item.idx }
		,${item.id }
		,${item.name }
		,${item.tel }
		,${item.phone }
		,${item.sex }
		,${item.reg_date }
	</c:forEach>
</body>
</html>