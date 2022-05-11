package com.allSafe.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allSafe.forms.ConnectionForm;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8");
		
		String formulaire = "Mon formulaire";
		request.setAttribute("formulaire", formulaire);
		
		this.getServletContext().getRequestDispatcher("/ressources/views/index.jsp").forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("Bonjour tout le monde !!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String formulaire = "Mon formulaire";
		request.setAttribute("formulaire", formulaire);
		
//		String telephone = request.getParameter("telephone");
//		request.setAttribute("telephone", telephone);
		
		ConnectionForm connectionForm = new ConnectionForm();
		connectionForm.verifierTel(request);
		
		request.setAttribute("connectionForm", connectionForm);
		
		this.getServletContext().getRequestDispatcher("/ressources/views/index.jsp").forward(request, response);
	}

}
