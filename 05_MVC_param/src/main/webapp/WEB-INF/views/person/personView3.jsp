<%@page import="com.spring.ex.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
personView3.jsp<hr>
아이디: ${p.id}<br>
아이디 : ${person.getId()}<br>
비밀번호: ${person.pw}<br>
이름 : ${name} <br>
이름 : ${p.name} <br>
이름 : ${requestScope.p.name} <br>
이름 : <%=request.getAttribute("name") %> <br>
이름 : <%=request.getParameter("name") %> <br>
주소: ${param.addr} <hr>
아이디: ${person.getId() }<br>
비밀번호: ${person.pw }<br>
이름: ${requestScope.person.id }<br>
주소: <%=((Person)request.getAttribute("person")).getAddr() %><br>


