package com.allSafe.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String resultat;
	
	public void verifierTel(HttpServletRequest request) {
		String telephone = request.getParameter("telephone");
		if (telephone.equals("781548345")) {
			resultat = "Vous êtes bien connecté !";
		}else {
			resultat = "Identifiants incorrects";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	

}
