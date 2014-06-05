<%@taglib uri="http://www.springframework.org/tags/form"  prefix="s"%>
<html>
<head>
</head>
<body>
	<s:form method="post" modelAttribute="person">
		Name <s:input path="name" />
		<s:errors path="name"></s:errors>
		<br/>
		Age <s:input path="age"/>
		<s:errors path="age"></s:errors>
		<br/>
		<input type="submit" value="Submit"/>
	</s:form>
</body>
</html>