package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head>");
		out.println("<title>edureka</title></head>");
		
		out.println("<body style=\"background-color:lightgreen;text-align:center\">");
		out.println("<h1>edureka limited</h1>");
		out.println("<img src=images/edureka.png width=400px>");
		out.println("<hr>");
		out.println("<p style=\"text-align:left;font-size:18px\">Hello "+ request.getParameter("txt_uid")+"</p><hr>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
