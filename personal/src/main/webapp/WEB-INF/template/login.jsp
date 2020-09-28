<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<form action="/login.action" method="post">
		<input type="text" name="id" id="id">
		<input type="password" name="pw" id="pw">
		<input type="submit" value="로그인">
	</form>
</body>
</html>