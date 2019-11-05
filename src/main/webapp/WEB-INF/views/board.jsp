<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<div class="text-center">
	<div class="btn">
		<input type="text" name="qnaSearch" id="qnaSearchText"> 
		<input type="button" class="btn btn-primary btn-sm" id="searchBtn" value="검색"> 
		<input type="button" class="btn btn-primary btn-sm" id="writingBtn" value="글작성"><br> 
	</div>
	
	<div class="boardList">
		<div id="board" class="table table-hover">
			<table>
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>날짜</th>
				</tr>
				<c:forEach var="board" items="${board}">
					<tr>
						<td><a href="/boardView/${board.board_no}">${board.board_no}</a></td>
						<td><a href="/boardView/${board.board_no}">${board.title}</a></td>
						<td>${board.member_no}</td>
						<td>${board.upload_time}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
	<script src="/resources/js/boardList.js"></script>
</body>

</html>