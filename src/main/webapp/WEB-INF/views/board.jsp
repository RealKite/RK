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
<script>
    function fn_paging(curPage){
        location.href="/boardList?curPage="+curPage;
    }
</script>
</head>
<body>
	총 게시글 수 : ${paging.listCnt} / 총 페이지 수 : ${paging.pageCnt } / 총 블럭 수 : ${paging.rangeCnt }
	총 게시글 수 : ${listCnt} / 현재 페이지 : ${paging.curPage } / 현재 블럭 : ${paging.curRange } 

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
		
		        <div class="greenTable outerTableFooter">
            <div class="tableFootStyle">
                <div class="links">
	                 	<a href="#" onClick="fn_paging(1)">[처음]</a> 
                    <c:if test="${paging.curPage ne 1}">
                        <a href="#" onClick="fn_paging(${paging.prevPage})">[이전]</a> 
                    </c:if>
                    <c:forEach var="pageNum" begin="${paging.startPage}" end="${paging.endPage}">
                        <c:choose>
                            <c:when test="${pageNum eq paging.curPage}">
                                <span style="font-weight: bold;">
                                    <a href="#" onClick="fn_paging(${pageNum})" style="font-weight: bold; color:red;">
                                        ${pageNum}
                                    </a>
                                </span> 
                            </c:when>
                            <c:otherwise>
                                <a href="#" onClick="fn_paging(${pageNum})">${pageNum}</a> 
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    <c:if test="${paging.curPage ne paging.pageCnt && paging.pageCnt > 0}">
                        <a href="#" onClick="fn_paging(${paging.nextPage})">[다음]</a> 
                    </c:if>
                    <c:if test="${paging.curRange ne paging.rangeCnt && paging.rangeCnt > 0}">
                        <a href="#" onClick="fn_paging(${paging.pageCnt})">[끝]</a> 
                    </c:if>
                </div>
            </div>
        </div>
	</div>
	<script src="/resources/js/boardList.js"></script>
</body>

</html>