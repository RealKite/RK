$(document).ready(function() {
	$("#modifyBtn").click(function() {
		location.href="/boardWrite/" + $("#board_no").val();
	});
	$("#deleteBtn").click(function() {
		location.href="/boardDelete/" + $("#board_no").val();
	});
	$("#backBtn").click(function() {
		history.go(-1)();
	});
});