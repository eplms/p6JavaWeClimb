package com.emmanuel.plumas;

import java.io.Serializable;

import javax.persistence.*;
// Ne pas faire d'import org.hibernate

//la classe UserEntity est mappée avec la table utilisateur
@Entity
@Table(name = "utilisateur")	
public class UserEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	private String identifiant;
	private String password;
	@Column (name="droitadministrateur")
	private Boolean droitAdministrateur;
	private String adresseMail;
	
	protected UserEntity() {
	}

	public Long getId() {
		return id;
	}

	// méthode setId n'est pas souhaitable car c'est le moteur de BDD qui fournit l'Id
	/*public void setId(Long id) {
		this.id = id;
	}*/

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

	public Boolean getDroitAdministrateur() {
		return droitAdministrateur;
	}

	public void setDroitAdministrateur(Boolean droitAdministrateur) {
		this.droitAdministrateur = droitAdministrateur;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", identifiant=" + identifiant + ", password=" + password
				+ ", droitAdministrateur=" + droitAdministrateur + ", adresseMail=" + adresseMail + "]";
	}
	
	
}
