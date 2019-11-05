<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
</head>
<body>
 
 	<form action="signCheck" method="post">
 	
 		<label for="id">아이디 : </label>
 		<input type="text" name="id">
 		
 		<label for="password">비밀번호 : </label>
 		<input type="password" name="password">
 		
 		<label for="email">이메일 : </label>
 		<input type="text" name="email">
 		
 		<label for="phone">전화번호 : </label>
 		<input type="text" name="phone">
 			
 		<input type="submit" value="가입">
 	
 	</form>
 
</body>
</html>