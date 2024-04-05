package com.octest.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Employee;

/**
 * Servlet implementation class Supprimer
 */
@WebServlet("/Supprimer")
public class Supprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supprimer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String Id = request.getParameter("Id");

	       
	        HttpSession session = request.getSession();
	        List<Employee> listEmp = (List<Employee>) session.getAttribute("listEmp");

	        if (Id != null) {
	            supprimerEmploye(listEmp, Id);
	        }

	        
	        response.sendRedirect("Affiche.jsp");
	    }

	    private void supprimerEmploye(List<Employee> listEmp, String Id) {
	        for (Employee emp : listEmp) {
	            if (emp.getId().equals(Id)) {
	                listEmp.remove(emp);
	                break;
	            }
	        }
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
