package test5;

import java.util.Objects;

public class Ville {
	private String nom;
	private String pays;
	private int nbrH;
	private char cat;
	private static int  nbreInstance;
	private static int nbreInstanceBis;
	
	public Ville() {
		this.nom = "inconnu";
		this.pays = "inconnu";
		this.nbrH= 0;
		this.setCat();
		
	}
	public Ville(String pNom, int pNbre, String pPays) throws  NombreHabitantException, NomVilleException
	{  
	  if(pNbre < 0)
	    throw new NombreHabitantException(pNbre);
	          
	  if(pNom.length() < 3)
	    throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
	  else
	  {
			      nbreInstance++;  
			      nbreInstanceBis++;

			      nom = pNom;
			      pays = pPays;
			      nbrH = pNbre;
			      this.setCat();
			    }
			  }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getNbrH() {
		return nbrH;
	}
	public void setNbrH(int nbrH) {
		this.nbrH = nbrH;
		this.setCat();
	}
	public char getCat() {
		return cat;
	}
	private void setCat() {
		int s []= {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char c [] = {'?','A','B','C','D','E','F','H'};
		int i = 0;
		while(i < s.length && this.nbrH > s[i])
			i++;
			this.cat =c[i];
		
		
			
	}
	public static void setNbreInstance(int nbreInstance) {
		Ville.nbreInstance = nbreInstance;
	}
	public static void setNbreInstanceBis(int nbreInstanceBis) {
		Ville.nbreInstanceBis = nbreInstanceBis;
	}
	public int hashCode() {
		  return Objects.hash(this.getCat(), this.getNbrH(), this.getPays(), this.getNom());
	}
	public boolean equals(Object obj) {
		  //On vérifie si les références d'objets sont identiques
		  if (this == obj)
		    return true;

		  //On s'assure que les objets sont du même type, ici de type Ville
		  if (getClass() != obj.getClass())
		    return false;
			
		  //Maintenant, on compare les attributs de nos objets
		  Ville other = (Ville) obj;

		  return Objects.equals(other.getCat(), this.getCat()) &&
			 Objects.equals(other.getNom(), this.getNom()) &&
			 Objects.equals(other.getNbrH(), this.getNbrH()) &&
			 Objects.equals(other.getPays(), this.getPays());
		}
	
	public String decrisToi () {
		String str ="le nom de cette ville est "+ this.nom+" est une ville de : "+this.pays+" elle comporte : "+this.nbrH+" habitant(s) => elle est donc de catégorie : "+this.cat;
		return str;
		
	}
	public String toString () {
		String str ="le nom de cette ville est "+ this.nom+" est une ville de : "+this.pays+" elle comporte : "+this.nbrH+" habitant(s) => elle est donc de catégorie : "+this.cat;
		return str;
		
	}
	public String comparer (Ville v) {
		String str = new String();
		
		if(this.nbrH < v.getNbrH()) {
			str = v.getNom()+" est plus peuplée que "+ this.getNom();
		}else {
			str = this.getNom()+" est plus peuplée que "+v.getNom();
			
		}
		return str;
	}
	
	

}
