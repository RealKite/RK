<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<h2>로그인 하십시오</h2>
	<br>
	
	<form method="post" action="/login">
	
		<div>
			<label for="id">이메일</label> 
			<input type="text" name="id" placeholder="id" required>
		</div>
		
		<div>
			<label for="password">비밀번호</label> 
			<input type="password" name="password" placeholder="Password" required>
		</div>
		
		<button type="submit">로그인</button>
		<a href="/member/signUp">회원가입</a>
		
	</form>
</body>
</html>