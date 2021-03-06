package com.info.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.info.model.ItemModel;
import com.info.model.UserModel;
import com.info.service.ItemService;
import com.info.service.UserService;

/**
 * Servlet implementation class Welcomeuser
 */
@WebServlet("/Welcomeuser")
public class Welcomeuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcomeuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
HttpSession session=request.getSession();
		
		ArrayList<UserModel> userDb=UserService.getDemo();
		
		session.setAttribute("userDb", userDb);
		
		
	ArrayList<ItemModel> itemDb=ItemService.getPalace();
		
		session.setAttribute("itemDb", itemDb);
		
		RequestDispatcher rd=request.getRequestDispatcher("WelUser.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
