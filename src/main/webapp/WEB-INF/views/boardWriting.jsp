<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardWriting</title>

<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>

</head>

<body>
	<h3>글작성</h3>
	<form action="/boardRegister">
		<div class="mb-3">
			<label for="board_no">글번호:</label> 
			<input type="text" class="form-control" id="board_no" name="board_no" readonly="readonly" value="${boardBean.board_no}">
		</div>
		<div class="mb-3">
			<label for="member_no">글쓴이:</label> 
			<input type="text" class="form-control" id="member_no" name="member_no" readonly="readonly" value="1">
		</div>
		<div class="mb-3">
			<label for="title">제목:</label>
			<input type="text" class="form-control" id="title" name="title" value="${boardBean.title}">
		</div>
		<div class="mb-3">
			<label for="contents">내용:</label>
			<textarea class="form-control" id="contents" name="contents">${boardBean.contents}</textarea>
		</div>
<!-- 		<div class="mb-3"> -->
<!-- 			<label for="email">파일</label> -->
<!-- 		</div> -->
		<div class="text-center">
			<input type="submit" class="btn btn-sm btn-primary" id="submitBtn" value="등록">
			<input type="submit" class="btn btn-sm btn-primary" id="submitBtn" value="수정">
		</div>
	</form>
</body>

</html>