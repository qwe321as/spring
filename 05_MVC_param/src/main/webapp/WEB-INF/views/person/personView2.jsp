<%@page import="com.spring.ex.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
personView2.jsp<hr>
아이디: ${param.id}<br>
비밀번호: ${param.pw}<br>
이름 : ${name} <br>
이름 : ${param.name} <br>
이름 : ${requestScope.name} <br>
이름 : <%=request.getAttribute("name") %> <br>
이름 : <%=request.getParameter("name") %> <br>
주소: ${param.addr} <br>
<hr>
person.id:${person.id }<br>
person.id:${person.getId() }<br>
person.id:${person["id"] }<br>
person.id:${requestScope.person.id }<br>
person.id:${requestScope.person.getId()}<br>
<%-- person.id:<%=request.getAttribute("person")%><br> 주소 --%>
person.id:<%=((Person)request.getAttribute("person")).getId() %><br>
<!-- requestScope 생략가능 -->
<hr>
pseron.pw : <%=((Person)request.getAttribute("person")).getPw() %><br>
pseron.pw : ${person.pw }<br>
pseron.pw : ${requestScope.person.pw }<br>
pseron.pw : ${person.getPw()}<br>
<hr>
pseron.name : <%=((Person)request.getAttribute("person")).getName() %><br>
pseron.name : ${person.name}<br>
pseron.name : ${requestScope.person.name }<br>
pseron.name : ${person.getName()}<br>
<hr>
person.addr : <%=((Person)request.getAttribute("person")).getAddr() %> <br>
person.addr : ${person.addr } <br>
person.addr : ${requestScope.person.addr } <br>
person.addr : ${person.getAddr() } <br>