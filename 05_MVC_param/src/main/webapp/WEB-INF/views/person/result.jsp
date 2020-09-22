<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
person/result<hr>
<h2>Model(속성설정)</h2>
이름 : ${name} <br>
나이 : ${age}<br>
이름 : <%=request.getAttribute("name")%> <br>
나이: <%=request.getAttribute("age")%> <br>
이름 : ${requestScope.name} <br>
나이 : ${requestScope.age} <hr>
<h2>Param</h2>
이름 : ${param.name} <br>
나이 : ${param.age} <br>
이름 : <%=request.getParameter("name")%> <br>
나이: <%=request.getParameter("age") %> <hr>