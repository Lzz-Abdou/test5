package test5;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Ville> list = new ArrayList<Ville>();

	  public void add(List<? extends Ville> listV){
	    for(Ville v : listV)
	      list.add(v); 

	    System.out.println("Contenu de notre garage :");
	    for(Ville v : list)
	      System.out.print(v.toString());		
	   }
}
