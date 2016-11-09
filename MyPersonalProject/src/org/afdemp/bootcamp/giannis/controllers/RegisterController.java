package org.afdemp.bootcamp.giannis.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.afdemp.bootcamp.giannis.dao.UserDao;
import org.afdemp.bootcamp.giannis.domain.User;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		
		//reading parameters from request
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//define RequestDispatchere object to forward errors
		RequestDispatcher errordis = getServletContext().getRequestDispatcher("/login.jsp");
		
		//define RequestDispatcher object to forward if data are correct
		RequestDispatcher succdis = getServletContext().getRequestDispatcher("/index.jsp");
		
		String errormsg = "";
		int ercounter = 0;
		
		try{
			if(firstname == null || firstname.length() == 0){
				errormsg +=ercounter + ") Το πεδίο όνομα δεν είναι έγυρο<br>";
			}
			
			if(lastname == null || lastname.length() == 0){
				errormsg +=ercounter + ") Το πεδίο Επώνυμο δεν είναι έγυρο<br>";
			}
			
			if(username == null || username.length() == 0){
				errormsg +=ercounter + ") Το πεδίο Όνομα Χρήστη δεν είναι έγυρο<br>";
			}
			
			if(email == null || email.length() == 0){
				errormsg +=ercounter + ") Το πεδίο Email δεν είναι έγυρο<br>";
			}
			
			if(password == null || password.length() == 0){
				errormsg +=ercounter + ") Το πεδίο password δεν είναι έγυρο<br>";
			}
			
			if(ercounter > 0){
				
				if(ercounter == 1)
					errormsg = "<h3>Βρέθηκε </h3>" + ercounter + " λάθος" + errormsg;
				else
					errormsg = "<h3>Βρέθηκαν </h3>" + ercounter + " λάθος" + errormsg;
			
				// adding error message (String) to request
				request.setAttribute("errormessage", errormsg);
				
				errordis.forward(request, response);
				
				return;
			}
			
			User user = new User(firstname, lastname, username, email, password);
			
			UserDao udao = new UserDao();
			
			udao.open(); // open connection
			
			udao.registerUser(user); //store user to databse
			
			udao.close(); // close connection
			
			request.setAttribute("userobject", user); //adding user object to request
			
			succdis.forward(request, response);
			return;
			
		} catch (Exception e) {
			
			request.setAttribute("errormessage", e.getMessage());
			
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
