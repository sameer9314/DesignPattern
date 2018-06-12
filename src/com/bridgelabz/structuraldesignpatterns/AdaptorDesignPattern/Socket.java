package com.bridgelabz.structuraldesignpatterns.AdaptorDesignPattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}

