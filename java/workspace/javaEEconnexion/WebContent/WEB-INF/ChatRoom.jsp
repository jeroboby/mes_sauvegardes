<%@page import="io.sopra.pox3.javaee.Constant"%>
<%@page import="io.sopra.pox3.javaee.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<iframe src="ChatRoomMessage.html">

</iframe>
	<form method="post">
		<input type="text" name="<%=Constant.NOM_PARAMETRE_MESSAGE%>">
		<button type="submit">Envoyer</button>
	</form>
</body>
</html>