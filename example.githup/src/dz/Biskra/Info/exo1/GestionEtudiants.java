package dz.Biskra.Info.exo1;


import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		LocalDate localDate=LocalDate.of(2002, Month.MAY, 06);
		
		Etudiant lolo =new Etudiant("aymen", "mor", "aaa@gmail.com", "07019",localDate);
		
		System.out.println(lolo.toString());
		
		Etudiant toto =new Etudiant("aymen", "mor", "aaa@gmail.com", "07019",localDate);

		
		System.out.println(lolo==toto);
		
		
	   toto=lolo;
	 
	 
	 toto.setNom("ahmed");
	 
	 
	 System.out.println(lolo.toString());
	 
	 
	 
	 
	 Etudiant fifi=new Etudiant("wail", "remadna", "aaa@gmail.com", "07019",localDate);
	 Etudiant riri=new Etudiant("wail", "remadna", "aaa@gmail.com", "07019",localDate);
	 
	 
	 Departement monDepInfo=new Departement("informtique", "biskra");
	 
	 monDepInfo.inscrire(lolo);
	 monDepInfo.inscrire(fifi);
	 monDepInfo.inscrire(toto);
	 monDepInfo.inscrire(riri);
	 
	 System.out.println("\n"+monDepInfo.toString());
	 
	 System.out.println("\nafter remove toto :");
	 
	 monDepInfo.desinscrire(toto);
	 
	 System.out.println("\n"+monDepInfo.toString());
	 
	 
	 
	 
	 
	}

}
