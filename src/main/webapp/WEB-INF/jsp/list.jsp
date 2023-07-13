<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="images/favicon.ico">
<title>TODO出力画面</title>
</head>
<body>
<h1>TODOアプリケーション</h1>
<h2>${user.userName }のTODOリスト</h2>
<table border="1">
<tr class="danger"><th>No</th><th>重要度</th><th>内容</th><th>期日</th></tr>
<tr class="info"><td>1</td><td>${todo.priority}</td><td>${todo.todo}</td><td>${todo.deadline}</td></tr>
</table>
<a href="javascript:history.back();">戻る</a>

</body>
</html>