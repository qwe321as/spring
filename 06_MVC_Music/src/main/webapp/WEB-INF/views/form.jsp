<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

WEB-INF\views\form.jsp <br>


<form action="input4" method="get">
	<table border="1">
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>가수명</td>
			<td><input type="text" name="singer"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="전송">
			</td>
		</tr>
	</table>
</form>

