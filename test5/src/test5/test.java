package test5;

import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Enumeration;
public class test {

	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
	    hs.add("toto");
	    hs.add("Word");
	    hs.add("helloo");

	    java.util.Iterator<String> it =  hs.iterator();
	    while(it.hasNext())
	      System.out.println(it.next());
	 
	    System.out.println("\nParcours avec un tableau d'objet");
	    System.out.println("-----------------------------------");
	                
	    Object[] obj = hs.toArray();
	    for(Object o : obj)
	      System.out.println(o);           
	  
	}
}
