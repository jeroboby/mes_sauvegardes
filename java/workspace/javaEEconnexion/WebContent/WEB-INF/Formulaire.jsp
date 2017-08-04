<%@page import="io.sopra.pox3.javaee.Constant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action='connexion.html' method='post'>
		<br>${user.nom} <input type="text" name= '<%= Constant.NOM_PARAMETRE_NOM %>' value="nom"/> </br> 
		<br>${user.prenom} <input type="text" name= '<%= Constant.NOM_PARAMETRE_PRENOM %>' value= "prenom"/> </br>
		<button type='submit'>OK</button>
	</form>
</body>
</html>