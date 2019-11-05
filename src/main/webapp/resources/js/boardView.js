$(document).ready(function() {
	$("#modifyBtn").click(function() {
		location.href="/boardWriting/" + $("#board_no").val();
	});
	$("#deleteBtn").click(function() {
		location.href="/boardDelete";
	});
});