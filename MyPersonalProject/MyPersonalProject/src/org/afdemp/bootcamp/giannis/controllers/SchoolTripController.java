package org.afdemp.bootcamp.giannis.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.afdemp.bootcamp.giannis.dao.SchoolTripDao;
import org.afdemp.bootcamp.giannis.dao.UserDao;
import org.afdemp.bootcamp.giannis.domain.User;

/**
 * Servlet implementation class SchoolTripController
 */
@WebServlet("/index")
public class SchoolTripController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolTripController() {
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
		
		//reading parameters from vote button
		String name = request.getParameter("submit");
		String username = request.getParameter("username");
		//define RequestDispatcher object to forward if data are correct and successfully stored in database
		RequestDispatcher succdis = getServletContext().getRequestDispatcher("/index.jsp");
		
		try{
			
		HttpSession session = request.getSession(true);
		User user1 = (User)session.getAttribute("userobject");
		
		
		if(user1.getVote().equals("N")){
			SchoolTripDao schooldao = new SchoolTripDao();
			schooldao.open(); //open connection
			schooldao.updateVotes(name);
			schooldao.close();
			
			UserDao udao = new UserDao();
			udao.open(); //open connection
			udao.updateVoteStatus(username);
			udao.close();
			
			user1.setVote("Y");
			session.setAttribute("userobject", user1);
			succdis.forward(request, response);
			
			
			return;
			
		}
			
			succdis.forward(request, response);
			return;
		
		} catch (Exception e){
			request.setAttribute("errormessage", e.getMessage());
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
