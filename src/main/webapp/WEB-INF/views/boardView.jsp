<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardView</title>

<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>

</head>

<body>
	뷰
	<input type="button" class="btn btn-sm btn-primary" id="backBtn" value="돌아가기">
	<div class="mb-3">
		<label for="board_no">글번호:</label>
		<input type="text" class="form-control" id="board_no" name="board_no" value="${board.board_no}" readonly="readonly">
	</div>
	<div class="mb-3">
		<label for="member_no">글쓴이:</label> 
		<input type="text" class="form-control" id="member_no" name="member_no" value="${board.member_no}" readonly="readonly">
	</div>
	<div class="mb-3">
		<label for="title">제목:</label>
		<input type="text" class="form-control" id="title" name="title" value="${board.title}" readonly="readonly">
	</div>
	<div class="mb-3">
		<label for="contents">내용:</label>
		<textarea class="form-control" id="contents" name="contents" readonly="readonly">${board.contents}</textarea>
	</div>
	<div class="text-center">
		<input type="submit" class="btn btn-sm btn-primary" id="modifyBtn" value="수정">
		<input type="submit" class="btn btn-sm btn-primary" id="deleteBtn" value="삭제">
	</div>
	
	<script src="/resources/js/boardView.js"></script>
</body>

</html>