$(document).ready(function() {
	$("input[type=submit]").hide();
	
	if($("#board_no").val() == 0){
		$("#submitBtn").show();
		$("#modifyBtn").hide();
	}else{
		$("#modifyBtn").show();
		$("#submitBtn").hide();
	}
	
	$("#backBtn").click(function() {
		history.go(-1)();
	});
	
});