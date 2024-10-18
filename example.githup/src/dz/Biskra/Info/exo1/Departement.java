package dz.Biskra.Info.exo1;

import java.util.ArrayList;

public class Departement {
	
	
	private String spécialité,adresse ;
	
	private ArrayList<Etudiant> etudiants;

	public Departement(String spécialité, String adresse) {
		super();
		this.spécialité = spécialité;
		this.adresse = adresse;
		this.etudiants=new ArrayList<Etudiant>();
	}

	@Override
	public String toString() {
		
		String result;
		
		result= "Departement [spécialité=" + spécialité + ", adresse=" + adresse + ", etudiants=";
		
		for(Etudiant etudiant:etudiants) {
			result +="\n";
			result +=etudiant.toString();
			
		}
		
		result +="]";
		
		return result;
	}
	
	
	public void inscrire(Etudiant etudiant) {
		etudiants.add(etudiant);
		
	}
	
	public void desinscrire(Etudiant etudiant) {
		etudiants.remove(etudiant);
		
	}
	
	
	
	
	

}
