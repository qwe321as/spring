<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여행 등록 화면</title>
</head>
<body>
web-inf\travel\TravelInsertForm.jsp<br>
<!-- 
*.tv요철
travel.controller
 -->
<form commandName=""  method="post"  action="insert.tv">
	<h1><span>여행 정보 등록 화면</span></h1>
	<p>
		<label for="name">이름</label>
		<input type="text" name="name" id="name" value="${travela.name }">
	</p>

	<p>
		<label for="age">나이</label>
		<input type="text" name="age" id="age" value="${travela.age }">
	</p>
	<p>
		<label for="area">관심지역</label>

		<input type="checkbox" name="area" id="area" value="유럽">유럽
		<input type="checkbox" name="area" id="area" value="동남아">동남아
		<input type="checkbox" name="area" id="area" value="일본">일본
		<input type="checkbox" name="area" id="area" value="중국">중국
	</p>
	
	<p>
		<label for="style">여행 타입</label>
		<input type="radio" name="style" id="style" value="패키지">패키지
		<input type="radio" name="style" id="style" value="크루즈">크루즈
		<input type="radio" name="style" id="style" value="자유여행">자유여행
		<input type="radio" name="style" id="style" value="골프여행">골프여행
	</p>
	
	 <p>
		<label for="price">가격</label>
		<select name = "price" id="price" >
			<option value="">선택하세요</option>
			<option value="100~200">100~200</option>
			<option value="200~300">200~300</option>
			<option value="300~400">300~400</option>
			<option value="400~500">400~500</option>
		</select>
		<form:errors cssClass="err" path="price"/>
	</p>
	<p class="btnRow">
			<input type="submit" value="추가하기" id="btnSubmit">		
		</p>
</form>
</body>
</html>