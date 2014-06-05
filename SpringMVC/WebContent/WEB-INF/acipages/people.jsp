<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
	<body>
		<s:form modelAttribute="p1" method="POST">
			Name<s:input path="name"/><br/>
			Age <s:input path="age"/><br/>
			<input type="submit" value="Add">
		</s:form>
	</body>
</html>