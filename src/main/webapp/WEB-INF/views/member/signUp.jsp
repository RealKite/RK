<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src='<c:url value="/resources/js/signUp.js"></c:url>'></script>

</head>
<body>
 
 <div>
 	<form action="signCheck" method="post" >
 	
 		<label for="id">아이디 : </label>
 		<input type="text" name="id" id="id" required="required">
 		<div id="id_check"></div>
 		
 		<label for="password">비밀번호 : </label>
 		<input type="password" name="password" id="password" required="required">
 		<div id="pw_check"></div>
 		
 		<label for="password2">비밀번호확인 : </label>
 		<input type="password" name="password2" id="password2" required="required">
 		<div id="pw2_check"></div>
 		
 		<label for="email">이메일 : </label>
 		<input type="text" name="email" id="email" required="required">
 		<div id="email_check"></div>
 		
 		<label for="phone">전화번호 : </label>
 		<input type="text" name="phone" id="phone" required="required">
 		<div id="phone_check"></div>
 			
 		<input type="submit" value="가입" id="signBtn">
 	
 	</form>
 </div>
 
 
</body>
</html>