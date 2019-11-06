<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src='<c:url value="/resources/js/member.js"></c:url>'></script>
</head>
<body>
 
 	<form action="signCheck" method="post" >
 	
 		<label for="id">아이디 : </label>
 		<input type="text" name="id" id="id">
 		<div id="id_check"></div>
 		
 		<label for="password">비밀번호 : </label>
 		<input type="password" name="password" id="password">
 		
 		<label for="email">이메일 : </label>
 		<input type="text" name="email" id="email">
 		
 		<label for="phone">전화번호 : </label>
 		<input type="text" name="phone" id="phone">
 			
 		<input type="submit" value="가입" id="signBtn">
 	
 	</form>
 
</body>
</html>