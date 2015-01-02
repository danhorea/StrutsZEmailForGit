<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<style>
	*{
	   font-family: Calibri, Arial;
	}
	body {
		background-color: #99CCFF;
	}
</style>
<head>
<title>Hello World</title>
</head>
<body>
<h4>This is the index page for Struts Email Client</h4>
Before pressing the button make sure that:<br>
<ul>
	<li>You configured the Tomcat server</li>
	<li>You added all jars in the web/WEB-INF/lib folder to the build path</li>
	<li>You added your Gmail email address and password in org.barosanu.email.EmailAction.java</li>
	<li>Fetching your inbox will take a few secconds, so be patient</li>
</ul>

   <form action="fetchEmailList">
   		<input type="submit" value="FETCH INBOX"/>
   </form>
   
   
</body>
</html>