<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
Member/list.jsp
<hr>
name: <%=request.getParameter("name")%><br>
name: ${param.name } <br>
name: ${name } <br>
name: ${requestScope.name } <br>
name: <%=request.getAttribute("name") %> <br>
<br>
pw: ${pw}<br>
pw: ${requestScope.pw  }<br>
pw: <%=request.getAttribute("pw")  %><br>