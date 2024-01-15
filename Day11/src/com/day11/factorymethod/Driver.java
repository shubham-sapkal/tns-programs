package com.day11.factorymethod;

public class Driver {

	public static void main(String argsp[]) {
		
		Computer PC = ComputerFactory.getComputer("PC", "2GB", "20GB", "intel i3");
		
		System.out.println("PC = " + PC);
		
		Computer Server = ComputerFactory.getComputer("Server", "32GB", "5TB", "intel server");
		
		System.out.println("Server = " + Server);
		
	}
	
}
