package com.bridgelabz.creationaldesignpatterns;

/*
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of class is created in the static block that provides 
 * option for exception handling.
 * */

public class StaticBlockInitialization {

	    private static StaticBlockInitialization instance;
	    
	    private StaticBlockInitialization(){}
	    
	    //static block initialization for exception handling
	    static{
	        try{
	            instance = new StaticBlockInitialization();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static StaticBlockInitialization getInstance(){
	        return instance;
	    }

}