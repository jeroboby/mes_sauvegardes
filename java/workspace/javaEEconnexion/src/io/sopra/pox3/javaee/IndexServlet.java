package io.sopra.pox3.javaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = Outil.getConnectedUser(req);

		if (user == null) {
			Outil.vueWelcomeNotConnected(req, resp);

		} else {
			Donnees.createChatRoom();
			System.out.println(Donnees.chatrooms.size());
			Outil.vueWelcomeConnected(user, Donnees.chatrooms, req, resp);
			
		}
	}

}
