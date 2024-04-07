package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Employee;

/**
 * Servlet implementation class Modifier
 */
@WebServlet("/Modifier")
public class Modifier extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
    
    public Modifier() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        String Id = request.getParameter("Id");
  
        

        	    for (Employee empl : Affiche.listEmp) {
        	        if (empl.getId().equals(Id)) {
        	        	request.setAttribute("employeeToModify", empl);
        	           
        	        }
        	    }
        	    
        	
        	   
        	        
        	        this.getServletContext().getRequestDispatcher("/WEB-INF/Modifier.jsp").forward(request, response);
        	   
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    String Id = request.getParameter("Id");
    	    String newNom = request.getParameter("newNom");
		    String newEmail = request.getParameter("newEmail");
		    String newNuméro = request.getParameter("newNumero");
		    String newDépartement = request.getParameter("newDepartement");
		    String newPoste = request.getParameter("newPoste");
		   
    	  

    	    
    	    for (Employee emp : Affiche.listEmp) {
    	        if (emp.getId().equals(Id)) {
    	           
    	        	 emp.setNom(newNom);
    	    	        emp.setEmail(newEmail);
    	    	        emp.setNuméro(newNuméro);
    	    	        emp.setDépartement(newDépartement);
    	    	        emp.setPoste(newPoste);
    	        }
    	    }

    	
    	    
   			    
    	       
    	       

   
    	        request.setAttribute("listEmp", Affiche.listEmp);
    	 
    	    
    	    this.getServletContext().getRequestDispatcher("/WEB-INF/Affiche.jsp").forward(request, response);
    }
   
    }


   
               
            
  
