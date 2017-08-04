package io.sopra.pox3.javaee;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d = new Date();
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		
		resp.setContentType("text.html");
		resp.getWriter().print("<html><head></head><body> Coucou, il est : " +d.toString()+ "</body></html>");
		resp.getWriter().print("<br> Le parametre 1 vaut " + p1 + "</br>");
		resp.getWriter().print(" <br> Le parametre 2 vaut " + p2 + "</br>");
		
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Date d = new Date();
	String p1 = req.getParameter("param1");
	String p2 = req.getParameter("param2");
	
	resp.setContentType("text.html");
	resp.getWriter().print("<html><head></head><body> Coucou, il est : " +d.toString()+ "</body></html>");
	resp.getWriter().print("<br> Le parametre 1 vaut " + p1 + "</br>");
	resp.getWriter().print(" <br> Le parametre 2 vaut " + p2 + "</br>");
}
}
