package com.octest.servlets;

import java.io.IOException;
import java.util.ArrayList;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Employee> List_Emp=new ArrayList<>();
		
	     String Nom = request.getParameter("nom");
	     String Email = request.getParameter("Email");
	     String Numéro = request.getParameter("Numero");
	     String Département = request.getParameter("Département");
	     String Poste = request.getParameter("Poste");
	     Employee Emp=new Employee(Nom,Email,Numéro,Département,Poste);
	     List_Emp.add(Emp);
	     request.setAttribute("Employees",List_Emp);
	     
	
	     
	     
	        this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche.jsp").forward(request, response);
	}

}
