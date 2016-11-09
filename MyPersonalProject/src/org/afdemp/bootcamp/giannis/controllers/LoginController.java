package org.afdemp.bootcamp.giannis.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.afdemp.bootcamp.giannis.dao.UserDao;
import org.afdemp.bootcamp.giannis.domain.User;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		//reading parameters from log in form
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//define requestDispatcher object to forward any errors
		RequestDispatcher errordis = getServletContext().getRequestDispatcher("/login.jsp");
		
		//define RequestDispatcher object to forward if data are correct
		RequestDispatcher succdis = getServletContext().getRequestDispatcher("/index.jsp");
		
		String msg = "";
		int ercounter = 0;
		
		try{
			
			if(username == null || username.length() == 0){
				msg += ++ ercounter +") Username is empty<br>";
			}
			
			if(password == null || password.length() == 0){
				
				msg += ++ercounter +") Password is empty<br>";
			}
			
			if(ercounter > 0){
				
				if(ercounter == 1)
					msg = "<h3>Βρέθηκε " + ercounter + " λάθος</h3>" + msg;
				else
					msg = "<h3>Βρέθηκαν " + ercounter + " λάθος</h3>" + msg;
				
				//adding error message (String) to request
				request.setAttribute("msg", msg);
				
				return;
			}
			
			User user = new User();
			UserDao udao = new UserDao();
			
			udao.open();//open connection 
			
			user = udao.authenticateUser(username, password); // adding username and password from log in form
			
			udao.close(); //close connection
			
			HttpSession session = request.getSession(true);
			session.setAttribute("userobject", user);
			succdis.forward(request, response);
			
			return;
		} catch (Exception e) {
			
			
			request.setAttribute("msg", e.getMessage());
			
			errordis.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
