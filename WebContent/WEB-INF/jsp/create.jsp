<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<h1>どこつぶユーザー登録</h1>
	<form action="/docoTsubuKai/Create" method="post">
		<table>
			<tr>
				<td>ユーザーID:</td>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>パスワード:</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td>メールアドレス:</td>
				<td><input type="email" name="mail"></td>
			</tr>
			<tr>
				<td>名前:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>年齢:</td>
				<td><input type="text" name="age"></td>
			</tr>
		</table>
		<input type="submit" value="登録">
	</form>
</body>
</html>