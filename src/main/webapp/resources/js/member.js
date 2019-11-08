/**
 * 자바스크립트
 */
$(document).ready(function() {

	$("#id").blur(function(){
	
		var id = $("#id").val();
		var idJ = /^[A-Za-z0-9]{4,20}$/;
		
		$ajax({
			url : "id_check?id="+id,
			type: "get",
			success: function(data){
				console.log("1 = 중복됨 / 0 = 중복안됨 : "+data);
				if(data==1){
					$("#id_check").text("사용중인 아이디입니다.");
					$("#id_check").css("color","red");
					$("#signBtn").attr("disabled", true);		
				}else{
					if(idJ.test(id)){
						$(id).text("");
						$("#signBtn").attr("disabled", false);
					
					}else if(id == ""){
						$('#id').text('아이디를 입력해주세요 :)');
						$('#id').css('color', 'red');
						$("#signBtn").attr("disabled", true);				
					}else{
						$('#id_check').text("아이디는 소문자와 숫자 4~12자리만 가능합니다 :) :)");
						$('#id_check').css('color', 'red');
						$("#reg_submit").attr("disabled", true);
					}
				}
			}, error : function(){
				console.log("실패");
			}
			
		});
	});
	
});
