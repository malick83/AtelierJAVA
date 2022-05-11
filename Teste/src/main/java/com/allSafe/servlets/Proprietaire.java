package com.allSafe.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allSafe.beans.CProprietaire;

/**
 * Servlet implementation class Proprietaire
 */
@WebServlet("/Proprietaire")
public class Proprietaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proprietaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String name = request.getParameter("name");
//		request.setAttribute("Firstname", name);
		
		CProprietaire cproprietaire = new CProprietaire();
		cproprietaire.setNom("KEBE");
		cproprietaire.setPrenom("Malick");
		cproprietaire.setActif(true);
		
		String [] professions = {"Professeur", "Etudiant", "Vendeur", "Chauffeur"};
		request.setAttribute("professions", professions);
		
		request.setAttribute("cproprietaire", cproprietaire);
		
		
		this.getServletContext().getRequestDispatcher("/ressources/views/proprietaires/proprietaires.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
