package io.sopra.pox3.javaee;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Outil {

	public static User getConnectedUser(HttpServletRequest req) {

		User user = (User) req.getSession().getAttribute(Constant.CLE_SESSION_USER);
		return user;
	}

	public static void setConnectedUser(User user, HttpServletRequest req) {

		req.getSession().setAttribute(Constant.CLE_SESSION_USER, user);
	}

	public static void vueWelcomeConnected(User user,List<ChatRoom> chatrooms, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		req.setAttribute("user", user);
		req.setAttribute("chatrooms", chatrooms);
		vue("WelcomeConnected", req, resp);
	}

	public static void vueWelcomeNotConnected(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		vue("WelcomeNotConnected", req, resp);
	}

	public static void vue(String jspName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/" + jspName + ".jsp").forward(req, resp);
	}

	public static void vueChatRoomMessage(List<Message> messages, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("messages", messages);
		vue("ChatRoomMessage", req, resp);
	}

	public static void vueChatRoom(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		vue("ChatRoom", req, resp);
	}
}