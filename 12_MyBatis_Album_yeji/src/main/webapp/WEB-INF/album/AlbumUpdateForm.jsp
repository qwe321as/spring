<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- AlbumInsertForm.jsp -->
<style>
.err {
	font-size: 9pt;
	color: red;
}
</style>
<h1>앨범 수정</h1>
<form:form commandName="albumBean" action="update.ab" method="post">
	<c:forEach var="bean" items="${list }">
	<p>
	<input type="hidden" name="num" value="${bean.num }">
		<label>노래제목</label> <input type="text" name="title" value="${bean.title }">
		<form:errors cssClass="err" path="title" />
	</p>
	<p>
		<label>가수명</label> <input type="text" name="singer" value="${bean.singer }">
		<form:errors cssClass="err" path="singer" />
	</p>
	<p>
		<label>가격</label> <input type="text" name="price"  value="${bean.price }">
		<form:errors cssClass="err" path="price" />
	</p>
	<p>
		<label>발매일</label> <input type="text" name="day" value="${bean.day }">
		<form:errors cssClass="err" path="day" />
	</p>
	<p>
		<input type="submit" value="수정하기">
		<input type="button" value="목록보기" onclick="location.href='list.ab'">
	</p>
	</c:forEach>
</form:form>