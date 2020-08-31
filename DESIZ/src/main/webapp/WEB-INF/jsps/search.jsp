<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save" method="post">
<pre>
		First Name: <input type="text" name="firstName"> Last Name: <input type="text"
			name="lastName"> No. Of Person <input type="text" name="numberOfPerson">
		Each Contribution: <input type="text" name="eachContribution"> Date: <input type="date"
			name="timeOfVisit"> Stay Period: <input type="text" name="periodOfStay">
		<input type="submit" value="search" />
		</pre>
	</form>
	${msg}
</body>
</html>