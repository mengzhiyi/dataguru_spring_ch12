<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加联系人</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/contact/save.do" method="post">
	<tr>
		<td>姓名</td>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr>
		<td>邮箱</td>
		<td><input type="text" name="email" /></td>
	</tr>
	<tr>
		<td>地址</td>
		<td><input type="text" name="address" /></td>
	</tr>
	<tr>
		<td>电话号码</td>
		<td><input type="text" name="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="提交"/>
		</td>
	</tr>	
</form>

</body>
</html>