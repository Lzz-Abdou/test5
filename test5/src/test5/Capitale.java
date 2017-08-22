package test5;



public class Capitale extends Ville {
	private String monument;
	public Capitale() {
		super();
		this.monument = "aucun";
		
	}

	public Capitale(String nom,int nbrH,String pays,String monument) throws NombreHabitantException, NomVilleException {
		super(nom,nbrH,pays);
		this.monument = monument;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	public String toString() {
		String str = super.toString() + " \n" +" \t => monument :" +this.getMonument();
		return str;
		}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitale other = (Capitale) obj;
		if (monument == null) {
			if (other.monument != null)
				return false;
		} else if (!monument.equals(other.monument))
			return false;
		return true;
	}
	

}
