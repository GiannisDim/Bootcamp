package org.afdemp.bootcamp.gdim;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExerciseThree
 */
@WebServlet("/exthree")
public class ExerciseThree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExerciseThree() {
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
		response.getWriter().append("<form action=\"/bootcamp/exthree\" method=\"POST\" >");
		response.getWriter().append("<input type=\"number\" name=\"number\" \n><br>");
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
	int number = Integer.parseInt(request.getParameter("number"));
		for(int i=2; i< number; i++){
			if(number % i == 0){
				response.sendRedirect("/bootcamp/hello");
				break;
			}
		}
		response.getWriter().append("Succes");
	}

}
