<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Bonjour, ${user.nom} ${user.prenom} Pour vous deconnecter,
	<a href='deconnexion.html'> suivez ce lien </a><br>
	<c:forEach var="chatRoom" items="${chatrooms}">
		<div>
			Chatroom : ${chatRoom.nom}
			<br>Pour acceder au chat, <a href ='chat.html'> suivez ce lien</a></br>
		</div>
		
	</c:forEach>
</body>
</html>