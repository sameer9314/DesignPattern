package com.bridgelabz.creationaldesignpatterns;

public class LazyInitialization {
	
    private static LazyInitialization object;
	
    private LazyInitialization() {}
    
	public static LazyInitialization retrunObject() {
		if(object==null) object= new LazyInitialization();
		return  object;
	}
}
