<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
	<h1>Welcome to the guessing game.</h1>
	<form action="play" method="POST">
		Enter your guess<input type="text" name="guess"><br/>
		<input type="submit" value="Guess">
	</form>
	<h1>${message}</h1>
	<h2>${attempts}</h2>
</body>
</html>