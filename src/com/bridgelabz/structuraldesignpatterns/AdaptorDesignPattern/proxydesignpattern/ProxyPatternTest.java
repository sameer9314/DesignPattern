package com.bridgelabz.structuraldesignpatterns.AdaptorDesignPattern.proxydesignpattern;

public class ProxyPatternTest {
	private static boolean status=true;
	public static void main(String[] args) throws Exception{
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand(" mkdir ");
			executor.runCommand(" ls -l");
			executor.runCommand(" rm -rf abc.pdf");
			status=false;
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
//finally{
//			executor.runCommand(" ls -l");
//		}
		
	}

}