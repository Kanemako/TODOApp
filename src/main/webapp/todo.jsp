<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date,java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODOアプリ出力画面</title>
</head>
<body>
<h1>TODOアプリケーション</h1>
<h2>兼松誠のTODOリスト</h2>
<table border="1">
<tr>
<th>No.</th>
<th>重要度</th>
<th>内容</th>
<th>期日</th>
</tr>
<% Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date); %>

<%for ( int i = 0;i<10;i++){
	String[] todoList = { "Linuxテスト対策", "paiza", "TODOアプリ作成", "履歴書" };
	int index = (int) (Math.random() * 4);
	String content = todoList[index];
%>
<tr>
<th><%=(i +1) %></th>
<th><%=(index +1) %></th>
<th><%= content %></th>
<th><%= today %></th>
</tr>
<% } %>

で
</table>


</body>
</html>