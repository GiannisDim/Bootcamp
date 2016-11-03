package org.afdemp.bootcamp.gdim;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExerciseFour
 */
@WebServlet("/exfour")
public class ExerciseFour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExerciseFour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("<form action=\"/bootcamp/exfour\" method=\"POST\" >");
		response.getWriter().append("<input name=\"username\"><br>");
		response.getWriter().append("<input type=\"password\" name=\"password\" \n><br>");
		response.getWriter().append("<input type=\"email\" name=\"email\" \n><br>");
		response.getWriter().append("<input type=\"submit\" value=\"bootcamp post\" \n>");
		response.getWriter().append("</form>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> keys = request.getParameterNames();
		String key = keys.nextElement();
		while(key != null){
			response.getWriter().append(key).append(" = ").append(request.getParameter(key)).append("\n");
			key = keys.nextElement();
		}
	}

}
