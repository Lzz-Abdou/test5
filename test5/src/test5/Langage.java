package test5;

public enum Langage {
     JAVA("java"),
	PHP("php"),
	C("c"),
	JS("java script");
	private String name;
	Langage(String name){
		this.name = name;
		
	}
	public String toString() {
		return name;
	}
	public static void main(String args[]) {
		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.C;
		System.out.println("Langage de " +l1.toString() );
		System.out.println("Langage de " +l2.toString() );
	}
	
}
