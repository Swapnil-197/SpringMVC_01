<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     This is SpringBoot_MVC application...!!!
     <h3>${errorMessage}</h3>
     <form>
       <input type="text" name="name" placeholder="Enter email"><br>
       <input type="password" name="password" placeholder="Enter password"></input><br>
       <input type="Submit" value="login" formaction="login" formmethod=post>
     </form>
</body>
</html>