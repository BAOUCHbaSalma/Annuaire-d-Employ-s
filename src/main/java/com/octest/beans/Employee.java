package com.octest.beans;


public class Employee {
	
	private String Nom;
	private String Email;
	private String Numéro;
	private String Département;
	private String Poste;
	
	public Employee(String Nom, String Email, String Numéro, String Département, String Poste) {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNuméro() {
		return Numéro;
	}
	public void setNuméro(String numéro) {
		Numéro = numéro;
	}
	public String getDépartement() {
		return Département;
	}
	public void setDépartement(String département) {
		Département = département;
	}
	public String getPoste() {
		return Poste;
	}
	public void setPoste(String poste) {
		Poste = poste;
	}

	

}
