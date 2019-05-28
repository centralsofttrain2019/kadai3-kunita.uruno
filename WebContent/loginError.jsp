<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="error" class="bean.LoginBean" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(error.getErrorC() == 1)
{%>
<font color=red>ユーザーIDには、半角数字を入力してください。</font>
<%}else if(error.getErrorC() == 2){%>
<font color=red>ユーザーIDは1～<%= error.getCount() %>までの数字を入力してください。</font>
<%} %>
<br>
<br>
ユーザー名を入力してください。

<form  method="POST" action="LoginSrvlet">
	ユーザーID<input name="userId" type="text" ><br>

	<input type="submit" value="ログイン">
</form>
</body>
</html>