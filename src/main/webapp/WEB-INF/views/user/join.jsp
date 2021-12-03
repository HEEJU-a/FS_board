<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
</head>
<body>
	<h1>회원가입페이지</h1>
<form id="frm" action="join" method="post">
   <div><input type="text" name="id" placeholder="아이디" required minlength="5" maxlength="15">
   	<input type="button" id="btnChkId" value="중복ID체크">
   	<div>아이디는 5자이상 15자이하로 작성해주세요</div>
   </div>
   <div><input type="password" name="pw" placeholder="비밀번호" required minlength="5" maxlength="15"></div>
   <div>비밀번호는 5자이상 15자이하로 작성해주세요</div>
   <div><input type="text" name="nm" placeholder="이름" required minlength="5" maxlength="9"></div>
   <div>이름은 5자이상 9자이하로 작성해주세요</div>
   <div>
       <input type="submit" value="회원가입">
   </div>
</form>
<script>
	var frmElem = document.querySelector('#frm');
	var btnChkIdElem = frmElem.btnChkId; //중복ID체크버튼
	
	btnChkIdElem.addEventListener('click', function(){
		var idElem = frmElem.id;
		idChkAjax(idElem.value);
	});
	
	function idChkAjax(id){
		console.log(id)
		
		if(id.length == 0){
			alert('id를 작성해주세요');
			return;
		}
		
		fetch('/user/idChk?id='+id)
		.then(function(res){
			return res.json();
		})
		.then(function(myJson){
			console.log(myJson);
			switch(myJson.result){
			case 0:
				alert('사용가능한 아이디 입니다');
				break;
			case 1:
				alert('이 아이디는 사용할 수 없습니다. 다른 아이디를 입력하여 주십시오');
				break;
			}
		});
	}
</script>
</body>
</html>