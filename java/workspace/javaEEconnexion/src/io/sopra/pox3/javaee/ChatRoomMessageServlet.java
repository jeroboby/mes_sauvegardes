package io.sopra.pox3.javaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatRoomMessage.html")
public class ChatRoomMessageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Donnees.createChatRoom();
		Outil.vueChatRoomMessage(Donnees.chatrooms.get(0).messages, req, resp);

	}

}
