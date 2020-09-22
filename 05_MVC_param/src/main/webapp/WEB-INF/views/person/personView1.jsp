<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
personView1.jsp<hr>
아이디: ${param.id}<br>
비밀번호: ${param.pw}<br>
이름 : ${Mname} <br>
이름 : ${param.Mname} <br>
이름 : ${requestScope.Mname} <br>
이름 : <%=request.getAttribute("Mname") %> <br>
주소: ${param.addr} <br>
