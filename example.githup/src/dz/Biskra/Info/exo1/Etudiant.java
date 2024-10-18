package dz.Biskra.Info.exo1;


import java.time.LocalDate;


public class Etudiant {
	
private String 	nom,prenom,adressemail, adressepostale;

private LocalDate datedenaissance;

public Etudiant(String nom, String prenom, String adressemail, String adressepostale, LocalDate datedenaissance) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adressemail = adressemail;
	this.adressepostale = adressepostale;
	this.datedenaissance = datedenaissance;
}

@Override
public String toString() {
	return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", adressemail=" + adressemail + ", adressepostale="
			+ adressepostale + ", datedenaissance=" + datedenaissance + "]";
}



public void setNom(String nom) {
	this.nom = nom;
}









	

}
