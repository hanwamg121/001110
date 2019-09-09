<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>贴吧</title>
</head>
<body>
 
<form action="servlet/PostBarServlet" method="get" name="postform">
<table border=1 cellpadding="10" cellspacing="0">
<c:forEach items="${list}" var="post">
	<tr>
		<td>id</td>
		<td>${post.message }</td>
	</tr>
	<tr>
		<td>主题</td>
		<td><a href="PostDetail.jsp">${post.message }</a></td>
	</tr>
	<tr>
	 <td>内容</td>
	 <td>${post.message }</td>
	</tr>
</c:forEach>
</table>
</form>
</body>
</html>

