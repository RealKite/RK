$(document).ready(function() {
	$("#writeBtn").click(function() {
		location.href="/boardWrite";
	});
	
	$("#searchBtn").click(function() {
		location.href="/board/" + $("#boardSearch").val();
	});
	
	$("td").click(function(e) {
		location.href="/boardView/" + $(e.target).closest("tr").find("#board_no").text();
	});
	
	$("#backBtn").click(function() {
		history.go(-1)();
	});

	$(".aTag").click(function(event) {
		event.preventDefault();
		console.log($(this).attr("id"));
		fn_paging($(this).attr("id"));
	});
	

});

function fn_paging(curPage){
    location.href="/board?curPage="+curPage;
}