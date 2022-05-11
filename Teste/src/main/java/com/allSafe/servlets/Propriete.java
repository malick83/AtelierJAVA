package com.allSafe.servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Propriete
 */
@WebServlet("/Propriete")
public class Propriete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final int TAILLE_TAMPON = 10240;
	private static final String CHEMIN_FICHIERS = "/home/shadowalker/Bureau/workSpace/JavaEE/files/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Propriete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/ressources/views/proprietes/proprietes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String description = request.getParameter("description");
		request.setAttribute("description", description);
		Part part = request.getPart("fichier");
		String nomFichier = getNomFichier(part);
		
		if (nomFichier != null && !nomFichier.isEmpty()) {
			String nomChamp = part.getName();
			
			nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/')+1).substring(nomFichier.lastIndexOf('\\') +1);
			
			ecrireFichier(part, nomFichier, CHEMIN_FICHIERS);
			
			request.setAttribute(nomChamp, nomFichier);
		}
		this.getServletContext().getRequestDispatcher("/ressources/views/proprietes/proprietes.jsp").forward(request, response);
	}
	private static String getNomFichier(Part part) {
		for (String contentDisposition : part.getHeader("content-disposition").split(";")) {
			if (contentDisposition.trim().startsWith("filename")) {
				return contentDisposition.substring(contentDisposition.indexOf('=')+1).trim().replace("\"", "");
			}
			
		}
		return null;
	}
	private void ecrireFichier(Part part, String nomFichier, String chemin) throws IOException {
		BufferedInputStream entree = null;
		BufferedOutputStream sortie = null;
		
		try {
			entree = new BufferedInputStream(part.getInputStream(), TAILLE_TAMPON);
			sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin + nomFichier)), TAILLE_TAMPON);
			
			byte[] tampon = new byte[TAILLE_TAMPON];
			int longueur;
			while ((longueur = entree.read(tampon)) > 0){
				sortie.write(tampon, 0, longueur);
			}
			
		} finally {
			try {
				sortie.close();
				
			} catch (IOException ignore) {
				// TODO: handle exception
			}
			try {
				entree.close();
				
			} catch (IOException ignore) {
				// TODO: handle exception
			}
		}
	}

}
