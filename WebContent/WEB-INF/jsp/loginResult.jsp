<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶへようこそ</title>
</head>
<body>
<h1>どこつぶログイン</h1>
<% if(loginUser != null){%>
	<p>ログインに成功しました</p>
	<p>ようこそ<%= loginUser.getName() %>さん</p>
	<a href="/docoTsubuKai/Main">つぶやき投稿・閲覧へ</a>
<% }else{ %>
	<p>ログインに失敗しました</p>
	<a href="/docoTsubuKai/">Topへ</a>//←あとで変更
<% } %>
</body>
</html>