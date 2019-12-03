package com.emmanuel.plumas;

public class Utilisateur {
	private String identifiant;
	private String password;
	private boolean droitAdministrateur;
	private String adresseMail;
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isDroitAdministrateur() {
		return droitAdministrateur;
	}
	public void setDroitAdministrateur(boolean droitAdministrateur) {
		this.droitAdministrateur = droitAdministrateur;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	
}
