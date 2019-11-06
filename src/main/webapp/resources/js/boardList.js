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
});