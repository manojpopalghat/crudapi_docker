<%@page import="com.manoj.crud.User"%>
<%@page import="java.util.List"%>
<%@page import="com.manoj.crud.UserRepository"%>
<html>
<head>
	<title>Welcome</title>
</head>
<body bgcolor="silver">
    <!-- <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey! -->
    <%
    	UserRepository repo = new UserRepository();
    	List<User> users = repo.getUsers();
    		
    %>
	    <h2>Microservice in Jersey RESTful Web Application</h2>
	    <hr>
	    <table border="1" cellspacing="0" cellpadding="0" style="width: 500px">
	    	<caption>User's Details</caption>
	    	<tr>
	    		<th align="center">ID</th>
	    		<th align="center">Name</th>
	    		<th align="center">Age</th>
	    		<th align="center">Department</th>
	    		<th align="center">Subjects</th>
	    	</tr>
	    	<%for(User user:users){ %>
	    	<tr>
	    		<td align="center"><%=user.getId()%></td>
	    		<td align="center"><%=user.getName() %></td>
	    		<td align="center"><%=user.getAge() %></td>
	    		<td align="center"><%=user.getDepartment() %></td>
	    		<td align="center"><%=user.getSubject()%></td>
	    	</tr>
	    	<%} %>
	    </table>
	    <hr>
	    <p>*To Check CRUD Operations in RESTful manner use following links*(<font color="red" style="font-size: 15;font-style: italic;">Supports in POSTMAN</font>)<br>
	    	GET Method for all users:<a href="http://localhost:8080/CRUD/webapi/users">http://localhost:8080/CRUD/webapi/users</a><br>
	    	GET Method for perticular user with id=101:<a href="http://localhost:8080/CRUD/webapi/users/read/101">http://localhost:8080/CRUD/webapi/users/read/101</a><br>
	    	POST Method for a user:<a href="http://localhost:8080/CRUD/webapi/users/create">http://localhost:8080/CRUD/webapi/users/create</a><br>
	    	PUT Method for a user<a href="http://localhost:8080/CRUD/webapi/users/update/">http://localhost:8080/CRUD/webapi/users/update/</a><br>
	    	DELETE Method for a user with id=101:<a href="http://localhost:8080/CRUD/webapi/users/delete/101">http://localhost:8080/CRUD/webapi/users/delete/101</a><br>
							    
	    </p>
</body>
</html>
