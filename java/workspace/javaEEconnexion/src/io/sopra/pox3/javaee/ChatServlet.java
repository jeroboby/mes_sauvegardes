package io.sopra.pox3.javaee;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chat.html")
public class ChatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outil.vueChatRoom(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String text = req.getParameter(Constant.NOM_PARAMETRE_MESSAGE);
		Date date = new Date();
		User user = Outil.getConnectedUser(req);
		if(user == null){
			user = new User("Ano", "Nymous");
		}
		
			Message message = new Message(date, user, text);
			Donnees.chatrooms.get(0).messages.add(message);
		
			Outil.vueChatRoom(req, resp);
	}
}
