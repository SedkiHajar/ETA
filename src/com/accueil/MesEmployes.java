package com.accueil;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mesClasses.Database;


@WebServlet("/MesEmployes")
public class MesEmployes extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MesEmployes() {
        super();
      
    }
    
   
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database tableNoms = new Database();
		String smail= (String)request.getSession().getAttribute("mail");
        request.setAttribute("utilisateurs", tableNoms.recupererEntreprises(smail));
        this.getServletContext().getRequestDispatcher("/WEB-INF/MesEmployes.jsp").forward(request, response);}

		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        }
        	
        }
	

