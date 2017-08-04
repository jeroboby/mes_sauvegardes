package io.sopra.pox3.javaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class BonjourServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(req, resp);

		return;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter(Constant.NOM_PARAMETRE_NOM);
		String firstName = req.getParameter(Constant.NOM_PARAMETRE_PRENOM);

		User user = new User(name, firstName);
		Outil.setConnectedUser(user, req);

		if (name == null || name.isEmpty() || firstName == null || firstName.isEmpty()) {

			req.getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(req, resp);
			return;
		}

		req.getRequestDispatcher("/WEB-INF/Bienvenue.jsp").forward(req, resp);
	}
}
