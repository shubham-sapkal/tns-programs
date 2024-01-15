package com.day11.factorymethod;

public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu)
	{
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}
	
	
	
}
