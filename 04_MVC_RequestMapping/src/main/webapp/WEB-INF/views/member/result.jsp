<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
member/result.jsp<hr>
id: <%=request.getParameter("id") %> <br>
id: ${param.id } <br>
id: ${id } <br>
id: ${requestScope.id } <br>
id: <%=request.getAttribute("id") %><br>