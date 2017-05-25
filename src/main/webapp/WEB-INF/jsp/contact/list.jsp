<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ContactList</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/contact/preSave.do">添加联系人</a> 
<table>
	<tr>
		<th colspan="6">
			 ${title } 
		</th>
	</tr>
	<tr>
		<th>ID</th>
		<th>姓名</th>
		<th>邮箱</th>
		<th>地址</th>
		<th>电话号码</th>
	</tr>
	<c:forEach var="contact" items="${contactList }">
	<tr>
		<td>${contact.id }</td>
		<td>${contact.name }</td>
		<td>${contact.email }</td>
		<td>${contact.address }</td>
		<td>${contact.telephone }</td>
		<td>
			<a href="${pageContext.request.contextPath}/contact/preSave.do?id=${contact.id }">修改</a>
		 	&nbsp;&nbsp;
		 	<a href="${pageContext.request.contextPath}/contact/delete.do?id=${contact.id }">删除</a>
		 </td>
	</tr>
	</c:forEach>		
</table>

</body>
</html>