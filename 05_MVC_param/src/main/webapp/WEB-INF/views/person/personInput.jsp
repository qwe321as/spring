<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
Person/personInput
<hr>
<form action="/ex/person/join4" method="post">
<!-- <form action="person/join1" method="post"> 원래는 이렇게 써도됌 -->
	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="text" name="pw"></td>
		</tr>
		<tr>
			<th>NAME</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>ADDR</th>
			<td><input type="text" name="addr"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="전송"></td>
		</tr>
	</table>
</form>