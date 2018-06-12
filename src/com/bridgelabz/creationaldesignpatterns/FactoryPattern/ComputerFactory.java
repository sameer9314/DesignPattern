package com.bridgelabz.creationaldesignpatterns.FactoryPattern;

public class ComputerFactory {

	public static Computer getComputer(Object type, String ram, String hdd, String cpu){
		if(type instanceof PC) 
			return new PC(ram, hdd, cpu);
		if(type instanceof Server) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}