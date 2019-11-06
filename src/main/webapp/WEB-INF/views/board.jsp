<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<link rel="stylesheet" href="/resources/css/board.css">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<input type="button" class="btn btn-sm btn-primary" id="backBtn" value="돌아가기">
	<div class="text-center">
		<div class="mb-3">
			<input type="text" class="form-control" name="boardSearch" id="boardSearch"> 
			<input type="button" class="btn btn-primary btn-sm" id="searchBtn" value="검색"> 
			<input type="button" class="btn btn-primary btn-sm" id="writeBtn" value="글작성"><br> 
		</div>
		
		<div id="boardList" class="table table-hover">
			<table class="table">
				<tr>
					<th scope="col">글번호</th>
					<th scope="col">제목</th>
					<th scope="col">글쓴이</th>
					<th scope="col">날짜</th>
				</tr>
				<c:forEach var="board" items="${board}">
					<tr id="list">
						<td id="board_no"><a href="/boardView/${board.board_no}">${board.board_no}</a></td>
						<td><a href="/boardView/${board.board_no}">${board.title}</a></td>
						<td>${board.member_no}</td>
						<td>${board.upload_time}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	<script src="/resources/js/boardList.js"></script>
</body>

</html>