<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="images/favicon.ico">
<title>TODOアプリログイン画面</title>
</head>
<body>
<h1>TODOアプリケーション</h1>
<h2>ログイン</h2>
<c:if test = "${errorMsg != null}">
<p>${errorMsg }</p>
</c:if>
<form action = "LoginServlet" method="post">
ユーザー名：<input type="text" name="userName"><br>
パスワード：<input type="password" name="pass"><br>
<input type="submit" value="ログイン">
</form>
</body>
</html>