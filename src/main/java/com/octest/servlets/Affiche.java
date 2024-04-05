package com.octest.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Employee;

/**
 * Servlet implementation class Affiche
 */
@WebServlet("/Affiche")
public class Affiche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Affiche() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public static ArrayList<Employee> listEmp = new ArrayList<>();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  		  
		
		  String Id = request.getParameter("Id");
		  
		  if(listEmp.stream().anyMatch(emp -> emp.getId().equals(Id))) {
			  
		  }
		  else {
			    String Nom = request.getParameter("Nom");
			    String Email = request.getParameter("Email");
			    String Numéro = request.getParameter("Numéro");
			    String Département = request.getParameter("Département");
			    String Poste = request.getParameter("Poste");
			    
			    Employee emp = new Employee(Id,Nom, Email, Numéro, Département, Poste);
			    listEmp.add(emp);		     
		   

		     request.setAttribute("listEmp",listEmp);
		  }
		  

	     
	      this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche.jsp").forward(request, response);
		 // this.getServletContext().getRequestDispatcher("/com.octest.servlets/Supprimer.java").forward(request, response);
	}

}
