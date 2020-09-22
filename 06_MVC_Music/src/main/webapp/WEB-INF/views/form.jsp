<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form action="input4" method="post">
	<table border="1">
		<tr>
			<th>제목</th>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<th>가수명</th>
			<td><input type="text" name="singer"></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="전송"></td>
		</tr>
	</table>
</form>