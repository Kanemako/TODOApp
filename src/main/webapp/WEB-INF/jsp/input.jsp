<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/input.css">
<link rel="shortcut icon" href="images/favicon.ico">

<title>TODOアプリ入力画面</title>
</head>
<body>
<form action = "InputServlet" method = "post">
<h1>TODOアプリケーション</h1>
<h2>TODO入力</h2>

<c:if test = "${errorMsg != null}">
<p>${errorMsg }</p>
</c:if>

重要度：<select name="priority">
<option>5</option>
<option>4</option>
<option>3</option>
<option>2</option>
<option>1</option>
</select><br>
内容：<input type="text" name = "todo"><br>
期日：<input type="date" name = "deadline"><br>

<div class="btn">
<a href = ''><button type="submit" >登録</button></a>
</div>
</form>

 
</body>
</html>