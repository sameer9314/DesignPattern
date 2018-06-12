package com.bridgelabz.creationaldesignpatterns;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking() instanceof ThreadSafeSingleton);
	}

}
