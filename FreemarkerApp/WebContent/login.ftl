<#import "spring.ftl" as spring />

<html>
	<body>
		<h1>
			${welcome}
		</h1>
		<form action="Login.spring" method="POST">
			<@spring.message "login.userName"/>
			<@spring.formInput "login.userName"/>
			<br/>
			<@spring.message "login.password"/>
			<@spring.formPasswordInput "login.password"/>
			<br/>
			<input type="submit">
		</form>
	</body>
</html>