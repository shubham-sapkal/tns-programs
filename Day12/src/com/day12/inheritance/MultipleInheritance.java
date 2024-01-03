package com.day12.inheritance;

class Country
{
	private String Capital;
	private String countryName;
	private String code;
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [Capital=" + Capital + ", countryName=" + countryName + ", code=" + code + "]";
	}
	
	
	
	
}

class States extends Country 
{
	private String stateName;
	private String stateLang;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateLang() {
		return stateLang;
	}
	public void setStateLang(String stateLang) {
		this.stateLang = stateLang;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateLang=" + stateLang + ", getCapital()=" + getCapital()
				+ ", getCountryName()=" + getCountryName() + ", getCode()=" + getCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}


class City extends States
{
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}


public class MultipleInheritance {

	public static void main(String[] args) {
		
		City mumbai = new City();
		
		mumbai.setCityName("Mumbai");
		
		mumbai.setStateName("Maharashtra");
		mumbai.setStateLang("Hindi");
		
		mumbai.setCapital("Delhi");
		mumbai.setCountryName("India");
		mumbai.setCode("+91");
		
	}

}
