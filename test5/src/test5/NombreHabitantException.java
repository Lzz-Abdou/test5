package test5;

class NombreHabitantException extends Exception{ 
	  public NombreHabitantException(){
	    System.err.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants n�gatif !");
	  }  
	  public NombreHabitantException(int nbre)
	  {
	    System.err.println("Instanciation avec un nombre d'habitants n�gatif.");
	    System.err.println("\t => " + nbre);
	  }
	}
