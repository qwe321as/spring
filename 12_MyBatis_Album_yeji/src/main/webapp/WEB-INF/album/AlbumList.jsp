<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!-- AlbumList -->
<h2>앨범 리스트 화면</h2>
<!-- 
whatColumn=title
keyword=날 
-->
<form action="list.ab" method="get">
	<select name="whatColumn">
		<option value="all">전체검색
		<option value="title">노래제목
		<option value="singer">가수명
	</select>
	<input type="text" name="keyword" value="아이유">
	<input type="submit" value="검색">
</form>
<table border="1" style="border-collapse: collapse;">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>가수</th>
		<th>가격</th>
		<th>출간일</th>
		<th>삭제</th>
		<th>수정</th>
	</tr>
	<c:forEach items="${list }" var="album">
		<tr>
			<td>${album.num }</td>
			<td>${album.title }</td>
			<td>${album.singer }</td>
			<td>${album.price }</td>
			<td>${album.day }</td>
			<td align="center"><a href="delete.ab?num=${album.num }">삭제</a></td>
			<td align="center"><a href="updateForm.ab?num=${album.num }">수정</a></td>
		</tr>
	</c:forEach>
	<tr>
	<td colspan="7" align="right"><a href="insert.ab">삽입</a></td>
	</tr>
</table>