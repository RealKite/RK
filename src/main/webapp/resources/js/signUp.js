/**
 * 자바스크립트
 */
$(document).ready(function() {
	
	var idJ =/^[A-Za-z0-9]{4,20}$/;
	var pwJ = /^[A-Za-z0-9]{4,12}$/; 
	var emailJ = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	var phoneJ = /^01([0|1]?)?([0-9]{4})?([0-9]{4})$/;
	
	$("#id").blur(function(){

		var id = $("#id").val();
		
		$.ajax({
			url : 'id_check',
			type: 'GET',
			data: {"id": id},
			dataType:'json',

			success: function(data){

				console.log("1 = 중복됨 / 0 = 중복안됨 =>"+data +"id : "+id);

				if(data==1){

					$("#id_check").text("사용중인 아이디입니다.");
					$("#id_check").css("color","red");
					$("#signBtn").attr("disabled", true);		

				}else{

					if(idJ.test(id)){

						$("#id_check").text("");
						$('#signBtn').attr("disabled", false);

					}else if(id == ""){
						$("#id_check").text("아이디를 입력해주세요.");
						$("#id_check").css("color", "red");
						$("#signBtn").attr("disabled", true);				
					}else{
						$("#id_check").text("아이디는 소문자와 숫자 4~12자리만 가능합니다.");
						$("#id_check").css('color', 'red');
						$("#signBtn").attr("disabled", true);
					}
				}
			}, error : function(){

				console.log("실패"+id);
			}

		});
	});
	
	$("#password").blur(function(){

		if(pwJ.test($("#password").val())){
			$("#pw_check").text("");
			
		}else{
			
			$("#pw_check").text("숫자 또는 문자로만 4~12자리 입력");
			$("#pw_check").css('color', 'red');
		}

	});
	$("#password2").blur(function(){

		if($("#password").val() != $(this).val()){
			$("#pw2_check").text("비밀번호가 일치하지 않습니다.");
			$("#pw2_check").css('color', 'red');
		}else{
			
			$("#pw2_check").text("");
		}

	});
	$("#email").blur(function(){

		if(emailJ.test($("#email").val())){
			$("#email_check").text("");
			
		}else{
			
			$("#email_check").text("올바른 형식의 email이 아닙니다.");
			$("#email_check").css('color', 'red');
		}

	});
	$("#phone").blur(function(){

		if(phoneJ.test($("#phone").val())){
			$("#phone_check").text("");
			
		}else{
			
			$("#phone_check").text("올바른 형식의 전화번호가 아닙니다.");
			$("#phone_check").css('color', 'red');
		}

	});
	

});
