package com.sdz;

public class X implements I,I2{

	@Override
	public void C() {
		// TODO Auto-generated method stub
		System.out.println("bonjour je suis la methode C");
	}

	@Override
	public String D() {
		// TODO Auto-generated method stub
		System.out.println("bonjour je suis la methode D");
		return null;
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub
	System.out.println("bonjour je suis la methode A");
		
	}

	@Override
	public String B() {
		// TODO Auto-generated method stub
		System.out.println("bonjour je suis la methode B");
		return null;
	}
	

}
