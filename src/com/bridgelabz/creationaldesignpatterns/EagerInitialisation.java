package com.bridgelabz.creationaldesignpatterns;

public class EagerInitialisation {
	
    private static EagerInitialisation object= new EagerInitialisation();
	
    private EagerInitialisation() {}
    
	public static EagerInitialisation retrunObject() {
		return  object;
	}
}