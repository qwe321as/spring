<%@page import="com.spring.ex.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
personView4.jsp<hr>
아이디: ${yeji.id}<br>
아이디 : ${person.getId()}<br>
비밀번호: ${person.pw}<br>
이름 : ${yeji.name} <br>
이름 : ${yeji.getName()} <br>
이름 : ${requestScope.yeji.name} <br>
주소: ${param.addr} <hr>
아이디: ${person.getId() }<br>
비밀번호: ${person.pw }<br>
이름: ${requestScope.person.id }<br>
주소: <%=((Person)request.getAttribute("yeji")).getAddr() %><br>
<hr>
아이디: ${yeji.id } <br>
비밀번호:${yeji.getPw() }<br>
이름:<%=((Person) request.getAttribute("yeji")).getName() %><br>
주소:${requestScope.yeji.addr }<br>
